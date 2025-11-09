package com.uparu.uparumaking

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.Spinner
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

enum class ElementFilter {
    ALL, GRASS, GROUND, FIRE, WATER, LIGHTNING, WIND, ICE, MAGIC, STAR, CLOUD
}
// 이름 -> UparuInfo 매핑
private val uparuByName: Map<String, UparuInfo> by lazy {
    UparuRepository.all.associateBy { it.name }
}

private fun List<Data2>.filterByElement(filter: ElementFilter): List<Data2> {
    if (filter == ElementFilter.ALL) return this

    return filter { data ->
        val info = uparuByName[data.name] ?: return@filter false
        val typeText = info.typeText

        when (filter) {
            ElementFilter.GRASS     -> "숲" in typeText
            ElementFilter.GROUND    -> "땅" in typeText
            ElementFilter.FIRE      -> "불" in typeText
            ElementFilter.WATER     -> "물" in typeText
            ElementFilter.LIGHTNING -> "천둥" in typeText
            ElementFilter.WIND      -> "바람" in typeText
            ElementFilter.ICE       -> "얼음" in typeText
            ElementFilter.MAGIC     -> "매직" in typeText
            ElementFilter.STAR      -> typeText.contains("빛") || typeText.contains("어둠") || typeText.contains("황금")
            ElementFilter.CLOUD     -> typeText.contains("구름")
            else                    -> true
        }
    }
}
class MainActivity3 : AppCompatActivity() {
    val dataList: List<Data2> = UparuRepository.all
        .map { it.toData2() }

    // 현재 정렬 + 필터 적용된 리스트
    private var currentSortedList: List<Data2> = dataList
    private var currentElementFilter: ElementFilter = ElementFilter.ALL

    private lateinit var gridView: GridView
    private lateinit var searchView: SearchView
    private lateinit var spinnerSort: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@MainActivity3, MainActivity::class.java)
                startActivity(intent)
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        gridView = findViewById(R.id.gridView)
        searchView = findViewById(R.id.searchView)
        spinnerSort = findViewById(R.id.spinner)

        // 초기 어댑터
        gridView.adapter = CustomAdapter2(this, currentSortedList)

        setupSortSpinner()
        setupTypeButtons()
        setupSearch()
        setupBottomButton()
        setupItemClick()
    }

    // ───────── 정렬 스피너 ─────────
    private fun setupSortSpinner() {
        val sortOptions = listOf("가나다순", "생산량순", "소환시간순")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sortOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSort.adapter = adapter

        spinnerSort.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                currentSortedList = when (sortOptions[position]) {
                    "가나다순" -> dataList.sortedBy { it.name }
                    "생산량순" -> dataList.sortedWith(compareBy({ -it.gold }, { it.name }))
                    "소환시간순" -> dataList.sortedWith(compareBy({ it.time }, { it.name }))
                    else -> dataList
                }
                applyFilterAndRefresh()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    // ───────── 타입 버튼들 ─────────
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
            currentElementFilter = filter
            applyFilterAndRefresh()
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

    // 실제로 필터 + 어댑터 교체
    private fun applyFilterAndRefresh() {
        val filtered = currentSortedList.filterByElement(currentElementFilter)
        gridView.adapter = CustomAdapter2(this, filtered)
    }

    // ───────── 검색 ─────────
    private fun setupSearch() {
        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = true

            override fun onQueryTextChange(newText: String?): Boolean {
                val base = currentSortedList.filterByElement(currentElementFilter)
                val filtered = if (newText.isNullOrBlank()) {
                    base
                } else {
                    base.filter { it.name.contains(newText) }
                }
                gridView.adapter = CustomAdapter2(this@MainActivity3, filtered)
                return true
            }
        })
    }

    // ───────── 하단 버튼 (MainActivity2 이동) ─────────
    private fun setupBottomButton() {
        val imgButton3 = findViewById<ImageButton>(R.id.button3)
        imgButton3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }

    // ───────── 아이템 클릭 → 조합법 화면 ─────────
    private fun setupItemClick() {
        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = (gridView.adapter as CustomAdapter2).getItem(position).name
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("changeName", selectedItem)
            startActivity(intent)
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }
}