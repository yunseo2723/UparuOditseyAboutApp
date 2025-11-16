package com.uparu.uparumaking.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uparu.uparumaking.adapter.SummonTimeAdapter
import com.uparu.uparumaking.adapter.SummonTimeItem
import com.uparu.uparumaking.R
import com.uparu.uparumaking.etc.UparuInfo
import com.uparu.uparumaking.UparuRepository
import com.uparu.uparumaking.etc.toSummonTimeItem

class BreedingTimeListActivity : AppCompatActivity() {
    val dataList: ArrayList<SummonTimeItem> = ArrayList(
        UparuRepository.all
            .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
            .map { it.toSummonTimeItem() }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeding_time_list)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                startActivity(Intent(this@BreedingTimeListActivity, HomeActivity::class.java))
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        val timeList = findViewById<RecyclerView>(R.id.timeList)

        timeList.adapter = SummonTimeAdapter(this, dataList)
        timeList.layoutManager = LinearLayoutManager(this)
    }
}