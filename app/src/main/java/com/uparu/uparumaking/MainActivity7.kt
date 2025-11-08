package com.uparu.uparumaking

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity7 : AppCompatActivity() {
    val dataList: ArrayList<TimeData2> = ArrayList(
        UparuRepository.all
            .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
            .map { it.toTimeData2() }
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
        setContentView(R.layout.activity_main7)

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val imgButton = findViewById<ImageButton>(R.id.selectButton)
        val questionButton = findViewById<ImageButton>(R.id.questionButton)


        questionButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.question_popup_layout)

            val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
            textViewContent.text =
                "상대 우파루를 선택해주세요.\n\n이후 <상성확인> 버튼을 누르면\n\n유리한 상성의 우파루를 확인할 수 있습니다."

            val closeButton = dialog.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                dialog.dismiss() // 팝업 닫기
            }

            dialog.show() // 팝업 다이얼로그 표시
        }

        imgButton.setOnClickListener {
            val intent = Intent(this, SelectUparu3::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        // MainActivity7에서 SharedPreferences를 사용하여 데이터 불러오기
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val changeUparu = sharedPreferences.getInt("changeUparu2", R.drawable.randomegg)

        // 이미지 버튼 1 정보 업데이트
        val uparuView1 = findViewById<ImageButton>(R.id.selectButton)
        uparuView1.setImageResource(changeUparu)

        val changeType = sharedPreferences.getString("changeType2", "1")

        val buttonJohap = findViewById<ImageButton>(R.id.checkButton)

        buttonJohap.setOnClickListener {
            recyclerView.visibility = View.VISIBLE

            // 각 속성에 대한 강한 속성과 약한 속성을 맵으로 지정
            val strongProperties = mapOf(
                "숲" to listOf("불", "얼음"),
                "땅" to listOf("바람", "매직", "황금"),
                "불" to listOf("물", "매직"),
                "물" to listOf("숲", "천둥"),
                "천둥" to listOf("땅", "바람", "빛"),
                "바람" to listOf("불", "매직"),
                "얼음" to listOf("불", "황금"),
                "매직" to listOf("물", "얼음"),
                "빛" to listOf("숲", "어둠"),
                "어둠" to listOf("땅", "빛"),
                "황금" to listOf("천둥", "어둠")
            )

            val weakProperties = mapOf(
                "숲" to listOf("물", "빛"),
                "땅" to listOf("천둥", "어둠"),
                "불" to listOf("숲", "바람", "얼음"),
                "물" to listOf("불", "매직"),
                "천둥" to listOf("물", "황금"),
                "바람" to listOf("땅", "천둥"),
                "얼음" to listOf("숲", "매직"),
                "매직" to listOf("땅", "불", "바람"),
                "빛" to listOf("천둥", "어둠"),
                "어둠" to listOf("빛", "황금"),
                "황금" to listOf("땅", "얼음")
            )
            fun getRemainingProperties(selectedProperty: String, weakProperties: Map<String, List<String>>): List<String> {
                val allProperties = listOf("숲", "땅", "불", "물", "천둥", "바람", "얼음", "매직", "빛", "어둠", "황금")

                val excludedProperties = weakProperties[selectedProperty] ?: emptyList()
                return allProperties.filterNot { excludedProperties.contains(it) }
            }

            fun printAllPossibleCombinations(strongA: List<String>, commonElements: List<String>, alltype: List<String>) : List<String> {
                val combinations = mutableListOf<String>()
                val combinationsa = mutableListOf<String>()
                val combinationsb = mutableListOf<String>()
                val combinationsc = mutableListOf<String>()
                val combinationsd = mutableListOf<String>()

                for (a in commonElements) {
                    if (strongA.contains(a)) {
                        for (b in alltype) {
                            for (c in alltype) {
                                val combination1 = listOf(a, b, c).joinToString(",")
                                val combination2 = listOf(a, b).joinToString(",")
                                val combination3 = listOf(a).joinToString(",")
                                combinationsa.add(combination1)
                                combinationsa.add(combination2)
                                if (combination3.contains(b)) {
                                    combinationsa.add(combination3)
                                }
                            }
                        }
                    }
                }
                for (a in commonElements) {
                    if (!strongA.contains(a)) {
                        for (b in strongA) {
                            for (c in strongA) {
                                val combination1 = listOf(a, b, c).joinToString(",")
                                val combination2 = listOf(a, b).joinToString(",")
                                val combination3 = listOf(a).joinToString(",")
                                combinationsb.add(combination1)
                                combinationsb.add(combination2)
                                if (combination3.contains(b)) {
                                    combinationsb.add(combination3)
                                }
                            }
                        }
                    }
                }
                for (a in commonElements) {
                    if (!strongA.contains(a)) {
                        for (b in strongA) {
                            if(strongA.contains(b))
                                for (c in alltype) {
                                    val combination1 = listOf(a, b, c).joinToString(",")
                                    val combination2 = listOf(a, b).joinToString(",")
                                    val combination3 = listOf(a).joinToString(",")
                                    combinationsc.add(combination1)
                                    combinationsc.add(combination2)
                                    if (combination3.contains(b)) {
                                        combinationsc.add(combination3)
                                    }
                                }
                        }
                    }
                }
                    for (a in commonElements) {
                        if (!strongA.contains(a)) {
                            for (c in strongA) {
                                if (alltype.contains(c) && strongA.contains(c)) {
                                    for (b in alltype) {
                                        val combination1 = listOf(a, b, c).joinToString(",")
                                        val combination2 = listOf(a, b).joinToString(",")
                                        val combination3 = listOf(a).joinToString(",")
                                        combinationsd.add(combination1)
                                        if (combination3.contains(c)) {
                                            combinationsd.add(combination2)
                                        }
                                        if (combination3.contains(c)) {
                                            combinationsd.add(combination3)
                                        }
                                    }
                                }
                            }
                        }
                    }

                combinations.addAll(combinationsa)
                combinations.addAll(combinationsb)
                combinations.addAll(combinationsc)
                combinations.addAll(combinationsd)
                return combinations.distinct()
            }

            val filteredDataList = dataList.filter { data ->
                    val result = data.type
                    val options = changeType?.split(",") ?: emptyList()
                    val a = options.getOrNull(0) ?: ""
                    val b = options.getOrNull(1) ?: ""
                    val c = options.getOrNull(2) ?: ""
                    val strongA = strongProperties[a] ?: emptyList()
                    val remaining = getRemainingProperties(a, weakProperties)
                    val remaining2 = getRemainingProperties(b, weakProperties)
                    val remaining3 = getRemainingProperties(c, weakProperties)
                    val commonElements = remaining.intersect(remaining2).intersect(remaining3).toList()
                    val alltype = getRemainingProperties("", weakProperties)
                    Log.d("Filtering", "$a $b $c $strongA $commonElements")

                    val resulttype = printAllPossibleCombinations(strongA, commonElements, alltype)

                resulttype.contains(result)

                } as ArrayList<TimeData2>

                val newAdapter = CustomAdapterTime2(this, filteredDataList)
                recyclerView.adapter = newAdapter
            }
        }
    }