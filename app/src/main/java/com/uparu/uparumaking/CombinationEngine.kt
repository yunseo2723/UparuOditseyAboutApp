package com.uparu.uparumaking

import android.content.Context

object CombinationEngine {

    // ---------- 1. 타입 조합 문자열 생성 (기존 generateCombinations) ----------
    private fun generateCombinations(str: String?): List<String> {
        val options = mutableListOf<String>()

        if (str != null) {
            if (str.contains("숲")) options.add("숲")
            if (str.contains("땅")) options.add("땅")
            if (str.contains("불")) options.add("불")
            if (str.contains("물")) options.add("물")
            if (str.contains("천둥")) options.add("천둥")
            if (str.contains("바람")) options.add("바람")
            if (str.contains("얼음")) options.add("얼음")
            if (str.contains("매직")) options.add("매직")
        }

        if (options.isEmpty()) return emptyList()
        if (options.size == 1) return options

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

        // 이진수로 부분집합 생성
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

    // ---------- 2. 부모 2마리 → 가능한 결과 TimeData2 리스트 (MainActivity6 필터 로직) ----------
    /**
     * MainActivity6 의 filteredDataList 로직을 그대로 옮겨놓은 함수.
     * allChildrenTimeData2는 UparuRepository.noevent.map { it.toTimeData2() } 같은 걸로 넘기면 됨.
     */
    fun possibleChildrenTimeData2(
        context: Context,
        parent1ResId: Int,
        parent2ResId: Int,
        parentType1: String?,
        parentType2: String?,
        allChildrenTimeData2: List<TimeData2>
    ): ArrayList<TimeData2> {

        val uparu1 = context.resources.getResourceEntryName(parent1ResId)
        val uparu2 = context.resources.getResourceEntryName(parent2ResId)

        val resulttype = generateCombinations(parentType1 + parentType2)
        val typenum = ("$parentType1,$parentType2").split(",").distinct().size

        val arrayRare = arrayOf(
            "yuni", "bongbong", "penriru", "foxy", "chepy", "bau", "boradoru", "cray",
            "hermi", "rudol", "kota2", "alpha", "toibo", "dumpti", "chao"
        )

        val isRare0 = !arrayRare.contains(uparu1) && !arrayRare.contains(uparu2)
        val isRare1 = (arrayRare.contains(uparu1) && !arrayRare.contains(uparu2)) ||
                (!arrayRare.contains(uparu1) && arrayRare.contains(uparu2))
        val isRare2 = arrayRare.contains(uparu1) && arrayRare.contains(uparu2)

        val isGrassContained = resulttype.contains("숲")
        val isGroundContained = resulttype.contains("땅")
        val isFireContained = resulttype.contains("불")
        val isWaterContained = resulttype.contains("물")
        val isWindContained = resulttype.contains("바람")
        //val isIceContained = resulttype.contains("얼음")
        val isLightningContained = resulttype.contains("천둥")
        //val isMagicContained = resulttype.contains("매직")

        val makingyongaru = isFireContained && isWaterContained
        val caselovelove =
            (uparu1 == "chocolove" && uparu2 == "cocolove") ||
                    (uparu1 == "cocolove" && uparu2 == "chocolove")
        val notmakingloveit = (uparu1 != "candylove2" && uparu2 != "candylove2")
        val impossibleset0 = (uparu1 == uparu2 && typenum == 3)
        val impossibleset1 = (uparu1 == "chupa" && uparu2 == "pori") || (uparu1 == "pori" && uparu2 == "chupa")
        val impossibleset2 = (uparu1 == "bbururu" && uparu2 == "chupa") || (uparu1 == "chupa" && uparu2 == "bbururu")
        val impossibleset3 = (uparu1 == "yongaru" && uparu2 == "dudeoru") || (uparu1 == "dudeoru" && uparu2 == "yongaru")
        val impossibleset4 = (uparu1 == "ururu" && uparu2 == "dupa") || (uparu1 == "dupa" && uparu2 == "ururu")
        val impossibleset5 = uparu1 == "randomegg" || uparu2 == "randomegg"

        return allChildrenTimeData2.filter { data ->
            val nameresult = data.profile      // R.drawable.xxx
            val result = data.type             // "숲,불" 같은 타입 문자열

            // 1) 러브럽: 오직 초코럽+코코럽 조합에서만 나와야 함
            if (nameresult == R.drawable.lovelove) {
                // 부모가 chocolove / cocolove 조합이 아니면 무조건 false
                return@filter caselovelove
            }

            // 2) 러빗: 부모에 candylove2(캔디럽)가 없으면 나오면 안 됨
            if (nameresult == R.drawable.loveit2 && notmakingloveit) {
                // notmakingloveit = 부모 둘 다 candylove2 아님
                return@filter false
            }

            // 3) 용가루: 불 + 물 조합
            if (nameresult == R.drawable.yongaru) {
                // makingyongaru = isFireContained && isWaterContained
                return@filter makingyongaru
            }

            // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
            //  ※ 이 아래의 when { ... } 전체를
            //    지금 MainActivity6 에 있는 것과 *동일하게* 옮기면 됨
            // -------------------------------------------------
            when {
                // (여기부터)
                (uparu1 == uparu2) && !impossibleset0 -> {
                    nameresult == parent1ResId
                }
                impossibleset1 || impossibleset2 || impossibleset3 || impossibleset4 || impossibleset5 -> {
                    false
                }
                impossibleset0 -> {
                    false
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
                else -> resulttype.contains(result)
            }
        } as ArrayList<TimeData2>
    }

    // ---------- 3. 결과 1마리 → 가능한 부모 조합들 ----------
    private val pairCache = mutableMapOf<Pair<Int, Int>, List<TimeData2>>() // 캐시

    fun possibleParents(
        context: Context,
        target: UparuInfo,
        candidates: List<UparuInfo> = UparuRepository.nostar
    ): List<Pair<UparuInfo, UparuInfo>> {

        val allChildren = UparuRepository.all.map { it.toTimeData2() }
        val result = mutableListOf<Pair<UparuInfo, UparuInfo>>()

        for (i in candidates.indices) {
            val p1 = candidates[i]
            for (j in i until candidates.size) {
                val p2 = candidates[j]

                val key = if (p1.profile < p2.profile)
                    p1.profile to p2.profile else p2.profile to p1.profile

                val children = pairCache.getOrPut(key) {
                    possibleChildrenTimeData2(
                    context = context,
                    parent1ResId = p1.profile,
                    parent2ResId = p2.profile,
                    parentType1 = p1.typeText,
                    parentType2 = p2.typeText,
                    allChildrenTimeData2 = allChildren
                    )
                }
                if (children.any { it.profile  == target.profile }) {
                    result += p1 to p2
                }
            }
        }
        return result
    }
}
