package com.uparu.uparumaking.activity

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
import com.uparu.uparumaking.adapter.TypeTimeAdapter
import com.uparu.uparumaking.adapter.TypeTimeItem
import com.uparu.uparumaking.etc.CombinationEngine
import com.uparu.uparumaking.R
import com.uparu.uparumaking.etc.UparuInfo
import com.uparu.uparumaking.UparuRepository
import com.uparu.uparumaking.etc.toTypeTimeItem

class BreedingResultActivity : AppCompatActivity() {
    //조합으로 안나오는 우파루(뽑기, 이벤트)는 추가하지 말것
    val dataList: List<TypeTimeItem> = UparuRepository.noevent
        .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
        .map { it.toTypeTimeItem() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeding_result)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                startActivity(Intent(this@BreedingResultActivity, HomeActivity::class.java))
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
            startActivity(Intent(this, SelectFirstParentActivity::class.java))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }

        uparuView2.setOnClickListener {
            startActivity(Intent(this, SelectSecondParentActivity::class.java))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }

        // BreedingResultActivity에서 SharedPreferences를 사용하여 데이터 불러오기
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

            // TypeTimeItem 전체 (이미 dataList 가 TypeTimeItem 리스트니까 재사용 가능)
            val filteredDataList = CombinationEngine.possibleChildrenTypeTimeItem(
                this,
                changeUparu1,
                changeUparu2,
                changeType1,
                changeType2,
                dataList
            )

            recyclerView.adapter = TypeTimeAdapter(this, filteredDataList)
        }
    }
}