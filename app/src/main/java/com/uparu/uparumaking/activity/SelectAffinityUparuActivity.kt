package com.uparu.uparumaking.activity

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.SearchView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.uparu.uparumaking.adapter.UparuGridItem
import com.uparu.uparumaking.adapter.UparuGridAdapter
import com.uparu.uparumaking.R
import com.uparu.uparumaking.UparuRepository
import com.uparu.uparumaking.UparuTypeRepository
import com.uparu.uparumaking.etc.toUparuGridItem

class SelectAffinityUparuActivity : AppCompatActivity() {
    val dataList: List<UparuGridItem> = UparuRepository.all
        .map { it.toUparuGridItem() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_uparu)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                startActivity(Intent(this@SelectAffinityUparuActivity, UparuAffinityActivity::class.java))
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        val gridView = findViewById<GridView>(R.id.gridView2)
        val searchView = findViewById<SearchView>(R.id.searchView)
        val sortedDataList = dataList.sortedBy { it.name }
        val newAdapter = UparuGridAdapter(this@SelectAffinityUparuActivity, sortedDataList)

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
                    val newAdapter =
                        UparuGridAdapter(this@SelectAffinityUparuActivity, filteredDataList)
                    gridView.adapter = newAdapter
                }
                return true
            }
        })

        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedName = (gridView.adapter as UparuGridAdapter).getItem(position).name
            val info = UparuTypeRepository.withStar[selectedName] ?: return@setOnItemClickListener

            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()

            editor.putInt("changeUparu2", info.imageResId)
            editor.putString("changeType2", info.typeText)
            editor.apply()

            startActivity(Intent(this@SelectAffinityUparuActivity, UparuAffinityActivity::class.java))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }
}