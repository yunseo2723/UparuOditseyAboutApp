package com.uparu.uparumaking

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity5 : AppCompatActivity() {
    val dataList: ArrayList<TimeData> = ArrayList(
        UparuRepository.all
            .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
            .map { it.toTimeData() }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@MainActivity5, MainActivity::class.java)
                startActivity(intent)
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        val timeList = findViewById<RecyclerView>(R.id.timeList)

        timeList.adapter = CustomAdapterTime(this, dataList)
        timeList.layoutManager = LinearLayoutManager(this)
    }
}