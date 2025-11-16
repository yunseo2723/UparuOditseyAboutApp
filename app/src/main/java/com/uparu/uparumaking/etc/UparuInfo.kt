package com.uparu.uparumaking.etc

data class UparuInfo(
    val profile: Int,
    val name: String,

    val gold: Int,
    val typeDrawable: Int,   // R.drawable.type 같은 타입 아이콘

    val egg: Int,            // R.drawable.egg 같은 알 이미지
    val typeText: String,    // "숲", "물,숲" 같은 타입 문자열
    val timeDisplay: String, // "7초", "3분", "4시간30분" 등 표시용 시간
    val timeForSort: Double,  // 정렬용 시간 (UparuListActivity 에서 쓰는 그 Double)

    val sell: Int = 0,       // 판매 가격 (숫자, 0이면 미입력으로)

    val isEvent: Boolean = false, // 뽑기/이벤트 여부
    val isStar: Boolean = false   // 별속성(빛/어둠) 여부
)