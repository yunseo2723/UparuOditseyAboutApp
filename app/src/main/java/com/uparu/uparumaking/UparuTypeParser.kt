package com.uparu.uparumaking

/*
 * "숲,불,얼음" 이런 typeText를 Element 집합으로 변환하는 유틸.
 */

private fun toElement(kor: String): Element? = when (kor.trim()) {
    "숲"   -> Element.GRASS
    "땅"   -> Element.GROUND
    "불"   -> Element.FIRE
    "물"   -> Element.WATER
    "천둥" -> Element.LIGHTNING
    "바람" -> Element.WIND
    "얼음" -> Element.ICE
    "마법" -> Element.MAGIC
    "별"   -> Element.STAR
    "구름" -> Element.CLOUD
    "빛"   -> Element.LIGHT
    "어둠" -> Element.DARK
    else  -> null // 모르는 문자열은 무시
}

/**
 * "숲,불,얼음" 같은 문자열을 Element 집합으로 변환.
 * 콤마/중점/슬래시/공백 기준으로 모두 잘라서 처리.
 */
fun parseElements(typeText: String): Set<Element> =
    typeText
        .split(',', '·', '/', ' ')
        .mapNotNull { token ->
            val t = token.trim()
            if (t.isEmpty()) null else toElement(t)
        }
        .toSet()

/**
 * UparuInfo에서 바로 elements()로 속성 집합을 얻을 수 있게 하는 확장 함수.
 *
 * 예시:
 *   val info: UparuInfo = ...
 *   val elements: Set<Element> = info.elements()
 */
fun UparuInfo.elements(): Set<Element> = parseElements(this.typeText)
