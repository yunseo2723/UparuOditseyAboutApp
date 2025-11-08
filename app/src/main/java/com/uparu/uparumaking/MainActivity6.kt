
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

class MainActivity6 : AppCompatActivity() {
    //조합으로 안나오는 우파루(뽑기, 이벤트)는 추가하지 말것
    val dataList: List<TimeData2> = UparuRepository.noevent
        .sortedWith(compareBy<UparuInfo> { it.timeForSort }.thenBy { it.name })
        .map { it.toTimeData2() }

    override fun onBackPressed() {
        super.onBackPressed();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val imgButton1 = findViewById<ImageButton>(R.id.randomButton1)
        val imgButton2 = findViewById<ImageButton>(R.id.randomButton2)

        imgButton1.setOnClickListener {
            val intent = Intent(this, SelectUparu::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        imgButton2.setOnClickListener {
            val intent = Intent(this, SelectUparu2::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        // MainActivity6에서 SharedPreferences를 사용하여 데이터 불러오기
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val changeUparu1 = sharedPreferences.getInt("changeUparu1", R.drawable.randomegg)
        val changeUparu2 = sharedPreferences.getInt("changeUparu2", R.drawable.randomegg)

        // 이미지 버튼 1 정보 업데이트
        val uparuView1 = findViewById<ImageButton>(R.id.randomButton1)
        uparuView1.setImageResource(changeUparu1)

        // 이미지 버튼 2 정보 업데이트
        val uparuView2 = findViewById<ImageButton>(R.id.randomButton2)
        uparuView2.setImageResource(changeUparu2)

        val changeType1 = sharedPreferences.getString("changeType1", "1")
        val changeType2 = sharedPreferences.getString("changeType2", "2")

        val buttonJohap = findViewById<ImageButton>(R.id.johapButton)
        val questionButton = findViewById<ImageButton>(R.id.questionButton)

        questionButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.question_popup_layout)

            val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
            textViewContent.text =
                "크로스할 두 우파루를 선택해주세요.\n\n이후 <조합시작> 버튼을 누르면\n\n소환 가능한 우파루를 확인할 수 있습니다"

            val closeButton = dialog.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                dialog.dismiss() // 팝업 닫기
            }

            dialog.show() // 팝업 다이얼로그 표시
        }

        buttonJohap.setOnClickListener {
            recyclerView.visibility = View.VISIBLE

            fun generateCombinations(str: String?): List<String> {
                val options = mutableListOf<String>()

                if (str != null) {
                    if (str.contains("숲")) options.add("숲")
                }
                if (str != null) {
                    if (str.contains("땅")) options.add("땅")
                }
                if (str != null) {
                    if (str.contains("불")) options.add("불")
                }
                if (str != null) {
                    if (str.contains("물")) options.add("물")
                }
                if (str != null) {
                    if (str.contains("천둥")) options.add("천둥")
                }
                if (str != null) {
                    if (str.contains("바람")) options.add("바람")
                }
                if (str != null) {
                    if (str.contains("얼음")) options.add("얼음")
                }
                if (str != null) {
                    if (str.contains("매직")) options.add("매직")
                }

                if (options.isEmpty()) {
                    return emptyList()
                } else if (options.size == 1) {
                    return options
                }

                val combinations = mutableListOf<String>()
                val n = options.size

                fun <T> List<T>.permutations(): List<List<T>> {
                    if (size <= 1) return listOf(this)
                    val element = first()
                    val perms = drop(1).permutations()
                    return perms.flatMap { perm ->
                        (0..perm.size).map { i ->
                            val newList = perm.toMutableList()
                            newList.add(i, element)
                            newList
                        }
                    }
                }

                // 이진수를 사용하여 모든 부분집합을 생성
                for (i in 1 until (1 shl n)) {
                    val subset = mutableListOf<String>()
                    for (j in 0 until n) {
                        if (i and (1 shl j) != 0) {
                            subset.add(options[j])
                        }
                    }
                    combinations.add(subset.joinToString(","))
                    if (subset.size == 2) {
                        combinations.add(subset.reversed().joinToString(","))
                    }
                    if (subset.size == 3) {
                        val perms = subset.permutations()
                        perms.forEach { perm ->
                            combinations.add(perm.joinToString(","))
                        }
                    }
                }
                return combinations
            }

            val filteredDataList = dataList.filter { data ->
                val Uparu1 = resources.getResourceEntryName(changeUparu1)
                val Uparu2 = resources.getResourceEntryName(changeUparu2)
                val nameresult = data.profile

                val result = data.type
                val resulttype = generateCombinations(changeType1+changeType2)
                val typenum = (changeType1+","+changeType2).split(",").distinct().size
                val arrayRare = arrayOf("yuni", "bongbong", "penriru", "foxy", "chepy", "bau", "boradoru", "cray", "hermi", "rudol", "kota2", "alpha", "toibo", "dumpti", "chao")
                val isGrassContained = resulttype.contains("숲")
                val isGroundContained = resulttype.contains("땅")
                val isFireContained = resulttype.contains("불")
                val isWaterContained = resulttype.contains("물")
                val isWindContained = resulttype.contains("바람")
                val isIceContained = resulttype.contains("얼음")
                val isLightningContained = resulttype.contains("천둥")
                val isMagicContained = resulttype.contains("매직")
                val isRare0 = !arrayRare.contains(Uparu1) && !arrayRare.contains(Uparu2)// 레어 없음 확인
                val isRare1 = (arrayRare.contains(Uparu1) && !arrayRare.contains(Uparu2)) || (!arrayRare.contains(Uparu1) && arrayRare.contains(Uparu2))// 레어 1 이상 확인
                val isRare2 = arrayRare.contains(Uparu1) && arrayRare.contains(Uparu2)// 레어 2 이상 확인

                val impossibleset0 = (Uparu1 == Uparu2 && typenum == 3)
                val impossibleset1 = (Uparu1 == "chupa"&& Uparu2 == "pori") || (Uparu1 == "pori"&& Uparu2 == "chupa")
                val impossibleset2 = (Uparu1 == "bbururu"&& Uparu2 == "chupa") || (Uparu1 == "chupa"&& Uparu2 == "bbururu")
                val impossibleset3 = (Uparu1 == "yongaru"&& Uparu2 == "dudeoru") || (Uparu1 == "dudeoru"&& Uparu2 == "yongaru")
                val impossibleset4 = (Uparu1 == "ururu"&& Uparu2 == "dupa") || (Uparu1 == "dupa"&& Uparu2 == "ururu")
                val makingyongaru = isFireContained && isWaterContained
                val notmakingloveit = (Uparu1 != "candylove2" && Uparu2 != "candylove2")
                val impossibleset5 = Uparu1 == "randomegg" || Uparu2 == "randomegg"
                val caselovelove = (Uparu1 == "chocolove"&& Uparu2 == "cocolove") || (Uparu1 == "cocolove"&& Uparu2 == "chocolove")

                Log.d("Filtering", "$caselovelove $notmakingloveit $typenum $Uparu1 $Uparu2 resulttype: $resulttype rare: $isRare1 $isRare2")
                when {
                    //동일한 우파루를 놓았을 때
                    (Uparu1 == Uparu2) && !impossibleset0 -> {
                        nameresult==changeUparu1
                    }
                    //상성인 우파루 혹은 3속성 우파루를 놓았을때 를 놓았을때
                    impossibleset1 || impossibleset2 || impossibleset3 || impossibleset4 || impossibleset5 -> {
                        nameresult==null
                    }
                    impossibleset0 -> {
                        nameresult==null
                    }
                    //레어 없이, 속성 4개(물or바람, 숲, 땅 포함) (레이, 쉐도우, 루미온)
                    isRare0 && typenum == 4 && (isWindContained || isWaterContained) && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                            // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult == R.drawable.rey || nameresult == R.drawable.shadow || nameresult == R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                         else
                            // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult == R.drawable.rey || nameresult == R.drawable.shadow || nameresult == R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 4개(숲, 땅 포함) (루미온)
                    isRare0 && typenum == 4 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 4개(물or바람 포함) (레이, 쉐도우)
                    isRare0 && typenum == 4 && (isWindContained || isWaterContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람, 숲, 땅, 천둥 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스, 블랙아피스, 루미온)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람, 숲, 땅 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스, 루미온)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람, 땅, 천둥 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(숲, 땅, 천둥 포함) (루미온, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare0 && typenum >= 5 && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rumion2 || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rumion2 || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(땅, 천둥 포함) (크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare0 && typenum >= 5 && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(숲, 땅 포함) (크로노, 고대신룡, 다크닉스, 루미온)
                    isRare0 && typenum >= 5 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물, 바람, 숲, 땅, 천둥 없이) (크로노, 고대신룡, 다크닉스)
                    isRare0 && typenum >= 5 -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    //레어 1개, 속성 4개(숲, 땅 포함) (루핀, 골디, 루미온)
                    isRare1 && typenum == 4 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 4개(숲, 땅 없이) (루핀, 골디)
                    isRare1 && typenum == 4 && (!isGrassContained || !isGroundContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(숲, 땅, 천둥 포함) (루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온, 블랙아피스)
                    isRare1 && typenum >= 5 && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(숲, 땅 포함) (루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온)
                    isRare1 && typenum >= 5 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(땅, 천둥 포함) (루핀, 골디, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare1 && typenum >= 5 && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(숲, 땅, 천둥 없이) (루핀, 골디, 크로노, 고대신룡, 다크닉스)
                    isRare1 && typenum >= 5 -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    //레어 2개, 속성 2, 3개 (다크골디)
                    isRare2 && (typenum == 2 || typenum == 3) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 4개(숲, 땅 포함) (다크골디, 루핀, 골디, 루미온)
                    isRare2 && typenum == 4 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 4개(숲, 땅 없이) (다크골디, 루핀, 골디)
                    isRare2 && typenum == 4 && (!isGrassContained || !isGroundContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(숲, 땅, 천둥 포함) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온, 블랙아피스)
                    isRare2 && typenum >= 5 && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(숲, 땅 포함) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온)
                    isRare2 && typenum >= 5 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(땅, 천둥 포함) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare2 && typenum >= 5 && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(숲, 땅, 천둥 없이) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스)
                    isRare2 && typenum >= 5 -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.clau || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    caselovelove -> {
                        nameresult == R.drawable.lovelove
                    }
                    notmakingloveit -> {
                        nameresult!=R.drawable.loveit2 && resulttype.contains(result)
                    }
                    //용가루 조합법
                    makingyongaru -> {
                        nameresult==R.drawable.yongaru || resulttype.contains(result)
                    }
                    else -> {
                        //평범한 경우
                        resulttype.contains(result) && nameresult != R.drawable.yongaru
                    }
                }
            } as ArrayList<TimeData2>

            val newAdapter = CustomAdapterTime2(this, filteredDataList)
            recyclerView.adapter = newAdapter
        }
    }
}