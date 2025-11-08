package com.uparu.uparumaking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity5 : AppCompatActivity() {
    val dataList: ArrayList<TimeData> = ArrayList(
        UparuRepository.all
            .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
            .map { it.toTimeData() }
    )

    override fun onBackPressed() {
        super.onBackPressed();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val timeList = findViewById<RecyclerView>(R.id.timeList)

        timeList.adapter = CustomAdapterTime(this, dataList)
        timeList.layoutManager = LinearLayoutManager(this)
    }
}