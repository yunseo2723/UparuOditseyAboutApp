package com.uparu.uparumaking

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.SearchView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class SelectUparu3 : AppCompatActivity() {
    val dataList: List<Data2> = UparuRepository.all
        .map { it.toData2() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_uparu)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@SelectUparu3, MainActivity7::class.java)
                startActivity(intent)
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        val gridView = findViewById<GridView>(R.id.gridView2)
        val searchView = findViewById<SearchView>(R.id.searchView)
        val sortedDataList = dataList.sortedBy { it.name }
        val newAdapter = CustomAdapter2(this@SelectUparu3, sortedDataList)

        gridView.adapter = newAdapter
        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    // 현재 보여지는 데이터를 filteredDataList로 업데이트
                    val filteredDataList = sortedDataList.filter { data -> data.name.contains(newText) }
                    // 그리드뷰 어댑터를 새로운 어댑터로 업데이트
                    val newAdapter = CustomAdapter2(this@SelectUparu3, filteredDataList)
                    gridView.adapter = newAdapter
                }
                return true
            }
        })

        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedName = (gridView.adapter as CustomAdapter2).getItem(position).name
            val info = UparuTypeMap.withStar[selectedName] ?: return@setOnItemClickListener

            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            val intent = Intent(this@SelectUparu3, MainActivity7::class.java)

            editor.putInt("changeUparu2", info.imageResId)
            editor.putString("changeType2", info.typeText)
            editor.apply()

            startActivity(intent)
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }
}