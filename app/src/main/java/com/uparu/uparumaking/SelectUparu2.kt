package com.uparu.uparumaking

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class SelectUparu2 : AppCompatActivity() {
    //조합 불가능한 우파루(별속성)는 추가하지 말것
    val dataList: List<Data2> = UparuRepository.nostar
        .map { it.toData2() }

    override fun onBackPressed() {
        super.onBackPressed();
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_uparu)

        val gridView = findViewById<GridView>(R.id.gridView2)
        val searchView = findViewById<SearchView>(R.id.searchView)
        val sortedDataList = dataList.sortedBy { it.name }
        var newAdapter = CustomAdapter2(this@SelectUparu2, sortedDataList)

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
                    val newAdapter = CustomAdapter2(this@SelectUparu2, filteredDataList)
                    gridView.adapter = newAdapter
                }
                return true
            }
        })

        gridView.setOnItemClickListener { _, _, position, _ ->
            val item = (gridView.adapter as CustomAdapter2).getItem(position) as Data2
            val info = UparuRepository.findByName(item.name) ?: return@setOnItemClickListener

            val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            val intent = Intent(this@SelectUparu2, MainActivity6::class.java)

            editor.putInt("changeUparu2", info.profile)
            editor.putString("changeType2", info.typeText)
            editor.apply()

            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}