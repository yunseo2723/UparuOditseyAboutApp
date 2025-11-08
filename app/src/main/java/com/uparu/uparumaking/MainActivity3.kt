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
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    val dataList: List<Data2> = UparuRepository.all
        .map { it.toData2() }

    override fun onBackPressed() {
        super.onBackPressed();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var sortedDataList: List<Data2> = dataList
        val spinnerSort = findViewById<Spinner>(R.id.spinner)
        val sortOptions = listOf("가나다순", "생산량순", "소환시간순")

        // 스피너 어댑터를 초기화하고 정렬 기준 목록을 설정
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sortOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSort.adapter = adapter

        val gridView = findViewById<GridView>(R.id.gridView)
        val searchView = findViewById<SearchView>(R.id.searchView)

// 스피너 선택 이벤트 처리
        spinnerSort.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedSort = sortOptions[position] // 선택한 정렬 기준

                // 정렬 기준에 따라 데이터를 정렬
                sortedDataList = when (selectedSort) {
                    "가나다순" -> dataList.sortedBy { it.name }
                    "생산량순" -> dataList.sortedWith(compareBy({ -it.gold }, { it.name }))
                    "소환시간순" -> dataList.sortedWith(compareBy({ it.time }, { it.name }))
                    else -> dataList // 이 예제에서는 기본으로 원본 데이터 유지
                }

                // 새로운 어댑터로 그리드뷰 업데이트
                val selectedAdapter = CustomAdapter2(this@MainActivity3, sortedDataList)
                gridView.adapter = selectedAdapter
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // 선택된 것이 없을 때의 처리
            }
        }
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

        buttonTypeAll.setOnClickListener {
            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, sortedDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeGrass.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typegrass || it.type == R.drawable.typefng ||
                        it.type == R.drawable.typefning || it.type == R.drawable.typefnlng ||
                        it.type == R.drawable.typegnf || it.type == R.drawable.typegngr ||
                        it.type == R.drawable.typegni || it.type == R.drawable.typegnl ||
                        it.type == R.drawable.typegnwa || it.type == R.drawable.typegnwangr ||
                        it.type == R.drawable.typegnwi || it.type == R.drawable.typegrng ||
                        it.type == R.drawable.typeing || it.type == R.drawable.typelng ||
                        it.type == R.drawable.typewang || it.type == R.drawable.typewangnl ||
                        it.type == R.drawable.typewaning || it.type == R.drawable.typewing ||
                        it.type == R.drawable.typewining || it.type == R.drawable.typefngrng ||
                        it.type == R.drawable.typefngnwa || it.type == R.drawable.typeingnwi ||
                        it.type == R.drawable.typegrnlng || it.type == R.drawable.typewinwang ||
                        it.type == R.drawable.typegnm || it.type == R.drawable.typemng ||
                        it.type == R.drawable.typewinmng || it.type == R.drawable.typemnwing ||
                        it.type == R.drawable.typemngnl || it.type == R.drawable.typegrnwang ||
                        it.type == R.drawable.typegnfni || it.type == R.drawable.typefngnl ||
                        it.type == R.drawable.typegninwi || it.type == R.drawable.typegnmnl ||
                        it.type == R.drawable.typegnmnf
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeGround.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typeground || it.type == R.drawable.typefngr ||
                        it.type == R.drawable.typegngr || it.type == R.drawable.typegnwangr ||
                        it.type == R.drawable.typegrnf || it.type == R.drawable.typegrnfnwa ||
                        it.type == R.drawable.typegrng || it.type == R.drawable.typegrni ||
                        it.type == R.drawable.typegrninwa || it.type == R.drawable.typegrnl ||
                        it.type == R.drawable.typegrnwa || it.type == R.drawable.typegrnwi ||
                        it.type == R.drawable.typeingr || it.type == R.drawable.typeingrnwi ||
                        it.type == R.drawable.typelngr || it.type == R.drawable.typewangr ||
                        it.type == R.drawable.typewingr || it.type == R.drawable.typegrninl ||
                        it.type == R.drawable.typefngrng || it.type == R.drawable.typegrnlng ||
                        it.type == R.drawable.typegrnm || it.type == R.drawable.typemngr ||
                        it.type == R.drawable.typewanwingr || it.type == R.drawable.typegrnwini ||
                        it.type == R.drawable.typegrnlnf || it.type == R.drawable.typegrnmnl ||
                        it.type == R.drawable.typegrnwang || it.type == R.drawable.typefngrnwa ||
                        it.type == R.drawable.typegrnlnwa
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeFire.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typefire || it.type == R.drawable.typefng ||
                        it.type == R.drawable.typefngr || it.type == R.drawable.typefni ||
                        it.type == R.drawable.typefning || it.type == R.drawable.typefnl ||
                        it.type == R.drawable.typefnlng || it.type == R.drawable.typefnlnwi ||
                        it.type == R.drawable.typefnwa || it.type == R.drawable.typefnwi ||
                        it.type == R.drawable.typegnf || it.type == R.drawable.typegrnf ||
                        it.type == R.drawable.typegrnfnwa || it.type == R.drawable.typeinf ||
                        it.type == R.drawable.typelnf || it.type == R.drawable.typewanf ||
                        it.type == R.drawable.typewinf || it.type == R.drawable.typelnfni ||
                        it.type == R.drawable.typefngrng || it.type == R.drawable.typefngnwa ||
                        it.type == R.drawable.typeinwinf || it.type == R.drawable.typefnm ||
                        it.type == R.drawable.typemnf || it.type == R.drawable.typemnwinf ||
                        it.type == R.drawable.typeinfnm || it.type == R.drawable.typegrnlnf ||
                        it.type == R.drawable.typefnwinl || it.type == R.drawable.typefngrnwa ||
                        it.type == R.drawable.typegnfni || it.type == R.drawable.typefngnl ||
                        it.type == R.drawable.typegnmnf
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeWater.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typewater || it.type == R.drawable.typefnwa ||
                        it.type == R.drawable.typegnwa || it.type == R.drawable.typegnwangr ||
                        it.type == R.drawable.typegrnfnwa || it.type == R.drawable.typegrninwa ||
                        it.type == R.drawable.typegrnwa || it.type == R.drawable.typeinwa ||
                        it.type == R.drawable.typelnwa || it.type == R.drawable.typelnwinwa ||
                        it.type == R.drawable.typewanf || it.type == R.drawable.typewang ||
                        it.type == R.drawable.typewangnl || it.type == R.drawable.typewangr ||
                        it.type == R.drawable.typewani || it.type == R.drawable.typewaning ||
                        it.type == R.drawable.typewaninl || it.type == R.drawable.typewanwi ||
                        it.type == R.drawable.typewinwa || it.type == R.drawable.typewinwani ||
                        it.type == R.drawable.typewanwinl || it.type == R.drawable.typefngnwa ||
                        it.type == R.drawable.typewinwang || it.type == R.drawable.typewanm ||
                        it.type == R.drawable.typemnwa || it.type == R.drawable.typewanwingr ||
                        it.type == R.drawable.typewaninm || it.type == R.drawable.typegrnwang ||
                        it.type == R.drawable.typefngrnwa || it.type == R.drawable.typeinwanwi ||
                        it.type == R.drawable.typegrnlnwa
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeLightning.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typelightning || it.type == R.drawable.typefnl ||
                        it.type == R.drawable.typefnlng || it.type == R.drawable.typefnlnwi ||
                        it.type == R.drawable.typegnl || it.type == R.drawable.typegrnl ||
                        it.type == R.drawable.typeinl || it.type == R.drawable.typelnf ||
                        it.type == R.drawable.typelng || it.type == R.drawable.typelngr ||
                        it.type == R.drawable.typelni || it.type == R.drawable.typelnwa ||
                        it.type == R.drawable.typelnwi || it.type == R.drawable.typelnwini ||
                        it.type == R.drawable.typelnwinwa || it.type == R.drawable.typewangnl ||
                        it.type == R.drawable.typewaninl || it.type == R.drawable.typewinl ||
                        it.type == R.drawable.typelnfni || it.type == R.drawable.typegrninl ||
                        it.type == R.drawable.typewanwinl || it.type == R.drawable.typegrnlng ||
                        it.type == R.drawable.typelnm || it.type == R.drawable.typemnl ||
                        it.type == R.drawable.typemninl || it.type == R.drawable.typemngnl ||
                        it.type == R.drawable.typegrnlnf || it.type == R.drawable.typefnwinl ||
                        it.type == R.drawable.typegrnmnl || it.type == R.drawable.typegrnlnwa ||
                        it.type == R.drawable.typefngnl || it.type == R.drawable.typegnmnl
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeWind.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typewind || it.type == R.drawable.typefnlnwi ||
                        it.type == R.drawable.typefnwi || it.type == R.drawable.typegnwi ||
                        it.type == R.drawable.typegrnwi || it.type == R.drawable.typeingrnwi ||
                        it.type == R.drawable.typeinwi || it.type == R.drawable.typelnwi ||
                        it.type == R.drawable.typelnwini || it.type == R.drawable.typelnwinwa ||
                        it.type == R.drawable.typewanwi || it.type == R.drawable.typewinf ||
                        it.type == R.drawable.typewing || it.type == R.drawable.typewingr ||
                        it.type == R.drawable.typewini || it.type == R.drawable.typewining ||
                        it.type == R.drawable.typewinl || it.type == R.drawable.typewinwa ||
                        it.type == R.drawable.typewinwani || it.type == R.drawable.typewanwinl ||
                        it.type == R.drawable.typeingnwi || it.type == R.drawable.typewinwang ||
                        it.type == R.drawable.typeinwinf || it.type == R.drawable.typemnwinf ||
                        it.type == R.drawable.typemnwi || it.type == R.drawable.typewinm ||
                        it.type == R.drawable.typewanwingr || it.type == R.drawable.typewinmng ||
                        it.type == R.drawable.typemnwing || it.type == R.drawable.typegrnwini ||
                        it.type == R.drawable.typefnwinl || it.type == R.drawable.typeinwanwi ||
                        it.type == R.drawable.typegninwi
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeIce.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typeice || it.type == R.drawable.typefni ||
                        it.type == R.drawable.typefning || it.type == R.drawable.typegni ||
                        it.type == R.drawable.typegrni || it.type == R.drawable.typegrninwa ||
                        it.type == R.drawable.typeinf || it.type == R.drawable.typeing ||
                        it.type == R.drawable.typeingr || it.type == R.drawable.typeingrnwi ||
                        it.type == R.drawable.typeinl || it.type == R.drawable.typeinwa ||
                        it.type == R.drawable.typeinwi || it.type == R.drawable.typelni ||
                        it.type == R.drawable.typelnwini || it.type == R.drawable.typewani ||
                        it.type == R.drawable.typewaning || it.type == R.drawable.typewaninl ||
                        it.type == R.drawable.typewini || it.type == R.drawable.typewining ||
                        it.type == R.drawable.typewinwani || it.type == R.drawable.typelnfni ||
                        it.type == R.drawable.typegrninl || it.type == R.drawable.typeingnwi ||
                        it.type == R.drawable.typeinwinf || it.type == R.drawable.typemni ||
                        it.type == R.drawable.typeinm || it.type == R.drawable.typemninl ||
                        it.type == R.drawable.typewaninm || it.type == R.drawable.typeinfnm ||
                        it.type == R.drawable.typegrnwini || it.type == R.drawable.typeinwanwi ||
                        it.type == R.drawable.typegnfni || it.type == R.drawable.typegninwi
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeMagic.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typemagic || it.type == R.drawable.typegrnm ||
                        it.type == R.drawable.typewanm || it.type == R.drawable.typemnl ||
                        it.type == R.drawable.typemnwi || it.type == R.drawable.typemnwinf ||
                        it.type == R.drawable.typemng || it.type == R.drawable.typegnm ||
                        it.type == R.drawable.typemnf || it.type == R.drawable.typefnm ||
                        it.type == R.drawable.typewinm || it.type == R.drawable.typelnm ||
                        it.type == R.drawable.typemngr || it.type == R.drawable.typemnwa ||
                        it.type == R.drawable.typeinm || it.type == R.drawable.typemni ||
                        it.type == R.drawable.typemninl || it.type == R.drawable.typewaninm ||
                        it.type == R.drawable.typeinfnm || it.type == R.drawable.typewinmng ||
                        it.type == R.drawable.typemnwing || it.type == R.drawable.typemngnl ||
                        it.type == R.drawable.typegrnmnl || it.type == R.drawable.typegnmnl ||
                        it.type == R.drawable.typegnmnf
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeStar.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typelight || it.type == R.drawable.typedark ||
                        it.type == R.drawable.typegold
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeCloud.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typecloud
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        val imgButton3 = findViewById<ImageButton>(R.id.button3)
        imgButton3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    // 현재 보여지는 데이터를 filteredDataList로 업데이트
                    val filteredDataList =
                        sortedDataList.filter { data -> data.name.contains(newText) }
                    // 그리드뷰 어댑터를 새로운 어댑터로 업데이트
                    val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
                    gridView.adapter = newAdapter
                }
                return true
            }
        })


        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = (gridView.adapter as CustomAdapter2).getItem(position)?.name

            val intent = Intent(this, MainActivity4::class.java)

            intent.putExtra("changeName", selectedItem)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}