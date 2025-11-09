package com.uparu.uparumaking

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity6 : AppCompatActivity() {
    //조합으로 안나오는 우파루(뽑기, 이벤트)는 추가하지 말것
    val dataList: List<TimeData2> = UparuRepository.noevent
        .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
        .map { it.toTimeData2() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@MainActivity6, MainActivity::class.java)
                startActivity(intent)
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val uparuView1 = findViewById<ImageButton>(R.id.randomButton1)
        val uparuView2 = findViewById<ImageButton>(R.id.randomButton2)

        uparuView1.setOnClickListener {
            val intent = Intent(this, SelectUparu::class.java)
            startActivity(intent)
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }

        uparuView2.setOnClickListener {
            val intent = Intent(this, SelectUparu2::class.java)
            startActivity(intent)
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }

        // MainActivity6에서 SharedPreferences를 사용하여 데이터 불러오기
        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val changeUparu1 = sharedPreferences.getInt("changeUparu1", R.drawable.randomegg)
        val changeUparu2 = sharedPreferences.getInt("changeUparu2", R.drawable.randomegg)

        // 이미지 버튼 1 정보 업데이트
        uparuView1.setImageResource(changeUparu1)

        // 이미지 버튼 2 정보 업데이트
        uparuView2.setImageResource(changeUparu2)

        val buttonJohap = findViewById<ImageButton>(R.id.johapButton)
        val questionButton = findViewById<ImageButton>(R.id.questionButton)

        questionButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.question_popup_layout)

            val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
            textViewContent.text = getString(R.string.cross_guide)

            val closeButton = dialog.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                dialog.dismiss() // 팝업 닫기
            }

            dialog.show() // 팝업 다이얼로그 표시
        }

        buttonJohap.setOnClickListener {
            recyclerView.visibility = View.VISIBLE

            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val changeUparu1 = sharedPreferences.getInt("changeUparu1", R.drawable.randomegg)
            val changeUparu2 = sharedPreferences.getInt("changeUparu2", R.drawable.randomegg)
            val changeType1 = sharedPreferences.getString("changeType1", "") ?: ""
            val changeType2 = sharedPreferences.getString("changeType2", "") ?: ""

            // TimeData2 전체 (이미 dataList 가 TimeData2 리스트니까 재사용 가능)
            val filteredDataList = CombinationEngine.possibleChildrenTimeData2(
                this,
                changeUparu1,
                changeUparu2,
                changeType1,
                changeType2,
                dataList  // ← 현재 MainActivity6 맨 위에서 만든 dataList
            )

            recyclerView.adapter = CustomAdapterTime2(this, filteredDataList)
        }
    }
}