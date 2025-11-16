package com.uparu.uparumaking.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.Spinner
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.uparu.uparumaking.adapter.UparuGridItem
import com.uparu.uparumaking.adapter.UparuGridAdapter
import com.uparu.uparumaking.R
import com.uparu.uparumaking.UparuRepository
import com.uparu.uparumaking.etc.toUparuGridItem

enum class ElementFilter {
    ALL, GRASS, GROUND, FIRE, WATER, LIGHTNING, WIND, ICE, MAGIC, STAR, CLOUD
}

// ─────────────────────── 메타 캐시 (이름별로 빠른 필터링용) ───────────────────────
private data class TypeMeta(
    val grass: Boolean,
    val ground: Boolean,
    val fire: Boolean,
    val water: Boolean,
    val lightning: Boolean,
    val wind: Boolean,
    val ice: Boolean,
    val magic: Boolean,
    val cloud: Boolean,
    val star: Boolean
)

private val metaByName: Map<String, TypeMeta> by lazy {
    UparuRepository.all.associateBy({ it.name }) { info ->
        val t = info.typeText
        TypeMeta(
            grass = "숲" in t,
            ground = "땅" in t,
            fire = "불" in t,
            water = "물" in t,
            lightning = "천둥" in t,
            wind = "바람" in t,
            ice = "얼음" in t,
            magic = "매직" in t,
            cloud = "구름" in t || info.typeDrawable == R.drawable.typecloud,
            star = ("빛" in t) || ("어둠" in t) || ("황금" in t)
        )
    }
}

// ─────────────────────── 확장함수: 고속 필터 ───────────────────────
private fun List<UparuGridItem>.filterByElement(filter: ElementFilter): List<UparuGridItem> {
    if (filter == ElementFilter.ALL) return this
    return filter { data ->
        val meta = metaByName[data.name] ?: return@filter false
        when (filter) {
            ElementFilter.GRASS     -> meta.grass
            ElementFilter.GROUND    -> meta.ground
            ElementFilter.FIRE      -> meta.fire
            ElementFilter.WATER     -> meta.water
            ElementFilter.LIGHTNING -> meta.lightning
            ElementFilter.WIND      -> meta.wind
            ElementFilter.ICE       -> meta.ice
            ElementFilter.MAGIC     -> meta.magic
            ElementFilter.STAR      -> meta.star
            ElementFilter.CLOUD     -> meta.cloud
            ElementFilter.ALL       -> true
        }
    }
}

class UparuListActivity : AppCompatActivity() {
    private val dataList: List<UparuGridItem> = UparuRepository.all.map { it.toUparuGridItem() }

    // 현재 정렬 + 필터 적용된 리스트
    private var currentSortedList: List<UparuGridItem> = dataList
    private var currentElementFilter: ElementFilter = ElementFilter.ALL

    // UI
    private lateinit var gridView: GridView
    private lateinit var searchView: SearchView
    private lateinit var spinnerSort: Spinner

    // 검색 디바운서
    private val searchHandler = Handler(Looper.getMainLooper())
    private var searchRunnable: Runnable? = null
    private var lastQuery: String = ""

    // 정렬 comparator 캐시
    private val comparatorByKey: Map<String, Comparator<UparuGridItem>> = mapOf(
        "가나다순" to Comparator { a, b -> a.name.compareTo(b.name) },
        "생산량순" to Comparator { a, b ->
            // 내림차순 금/분, 같으면 이름 오름차순
            val g = b.gold.compareTo(a.gold)
            if (g != 0) g else a.name.compareTo(b.name)
        },
        "소환시간순" to Comparator { a, b ->
            val t = a.time.compareTo(b.time)
            if (t != 0) t else a.name.compareTo(b.name)
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uparu_list)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                startActivity(Intent(this@UparuListActivity, HomeActivity::class.java))
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        gridView = findViewById(R.id.gridView)
        searchView = findViewById(R.id.searchView)
        spinnerSort = findViewById(R.id.spinner)

        // 초기 어댑터
        gridView.adapter = UparuGridAdapter(this, currentSortedList)

        setupSortSpinner()
        setupTypeButtons()
        setupSearch()
        setupBottomButton()
        setupItemClick()
    }

    // ───────── 정렬 스피너 ─────────
    private fun setupSortSpinner() {
        val sortOptions = listOf("가나다순", "생산량순", "소환시간순")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sortOptions).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
        spinnerSort.adapter = adapter

        spinnerSort.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                val key = sortOptions[position]
                val cmp = comparatorByKey[key] ?: comparatorByKey["가나다순"]!!
                // 정렬 적용
                currentSortedList = dataList.sortedWith(cmp)
                // 필터 및 검색 반영
                applyFilterAndRefresh()
                applySearch(lastQuery)
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    // ───────── 타입 버튼 ─────────
    private fun setupTypeButtons() {
        val buttonTypeAll = findViewById<ImageButton>(R.id.buttonTypeAll)
        val buttonTypeGrass = findViewById<ImageButton>(R.id.buttonTypeGrass)
        val buttonTypeGround = findViewById<ImageButton>(R.id.buttonTypeGround)
        val buttonTypeFire = findViewById<ImageButton>(R.id.buttonTypeFire)
        val buttonTypeWater = findViewById<ImageButton>(R.id.buttonTypeWater)
        val buttonTypeLightning = findViewById<ImageButton>(R.id.buttonTypeLightning)
        val buttonTypeWind = findViewById<ImageButton>(R.id.buttonTypeWind)
        val buttonTypeIce = findViewById<ImageButton>(R.id.buttonTypeIce)
        val buttonTypeMagic = findViewById<ImageButton>(R.id.buttonTypeMagic)
        val buttonTypeStar = findViewById<ImageButton>(R.id.buttonTypeStar)
        val buttonTypeCloud = findViewById<ImageButton>(R.id.buttonTypeCloud)

        fun setFilterAndRefresh(filter: ElementFilter) {
            if (currentElementFilter == filter) {
                // 동일 필터 재적용 시에도 검색어는 반영
                applySearch(lastQuery)
                return
            }
            currentElementFilter = filter
            applyFilterAndRefresh()
            applySearch(lastQuery)
        }

        buttonTypeAll.setOnClickListener { setFilterAndRefresh(ElementFilter.ALL) }
        buttonTypeGrass.setOnClickListener { setFilterAndRefresh(ElementFilter.GRASS) }
        buttonTypeGround.setOnClickListener { setFilterAndRefresh(ElementFilter.GROUND) }
        buttonTypeFire.setOnClickListener { setFilterAndRefresh(ElementFilter.FIRE) }
        buttonTypeWater.setOnClickListener { setFilterAndRefresh(ElementFilter.WATER) }
        buttonTypeLightning.setOnClickListener { setFilterAndRefresh(ElementFilter.LIGHTNING) }
        buttonTypeWind.setOnClickListener { setFilterAndRefresh(ElementFilter.WIND) }
        buttonTypeIce.setOnClickListener { setFilterAndRefresh(ElementFilter.ICE) }
        buttonTypeMagic.setOnClickListener { setFilterAndRefresh(ElementFilter.MAGIC) }
        buttonTypeStar.setOnClickListener { setFilterAndRefresh(ElementFilter.STAR) }
        buttonTypeCloud.setOnClickListener { setFilterAndRefresh(ElementFilter.CLOUD) }
    }

    // 필터 적용 후 그리드 갱신
    private fun applyFilterAndRefresh() {
        val filtered = currentSortedList.filterByElement(currentElementFilter)
        gridView.adapter = UparuGridAdapter(this, filtered)
    }

    // ───────── 검색(디바운스) ─────────
    private fun setupSearch() {
        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // 키보드 검색 눌러도 디바운스 경로로 동일 처리
                scheduleSearch(query.orEmpty())
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                scheduleSearch(newText.orEmpty())
                return true
            }
        })
    }

    private fun scheduleSearch(q: String) {
        lastQuery = q
        searchRunnable?.let { searchHandler.removeCallbacks(it) }
        val r = Runnable { applySearch(q) }
        searchRunnable = r
        // 150ms 디바운스
        searchHandler.postDelayed(r, 150)
    }

    private fun applySearch(q: String) {
        val base = currentSortedList.filterByElement(currentElementFilter)

        val filtered = if (q.isBlank()) {
            base
        } else {
            val lower = q.lowercase()
            base.filter { it.name.lowercase().contains(lower) }
        }

        gridView.adapter = UparuGridAdapter(this, filtered)
    }

    // ───────── 하단 버튼 ─────────
    private fun setupBottomButton() {
        val imgButton3 = findViewById<ImageButton>(R.id.button3)
        imgButton3.setOnClickListener {
            startActivity(Intent(this, ElementSelectActivity::class.java))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }

    // ───────── 아이템 클릭 → 조합법 화면 ─────────
    private fun setupItemClick() {
        gridView.setOnItemClickListener { _, _, position, _ ->
            val selected = (gridView.adapter as UparuGridAdapter).getItem(position).name
            startActivity(Intent(this, UparuDetailActivity::class.java).putExtra("changeName", selected))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }
}