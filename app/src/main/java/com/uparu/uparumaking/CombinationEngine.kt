package com.uparu.uparumaking

/**
 * 타입(속성)만 보고 조합 가능한 부모 쌍을 찾아주는 엔진.
 *
 * 규칙:
 *  - target.elements() ⊆ (parent1.elements ∪ parent2.elements)
 *    → 부모 둘의 속성을 합쳤을 때, 타겟의 속성이 모두 포함되면 조합 가능하다고 본다.
 *
 * 예시:
 *  - target: "불"               → {FIRE}
 *    - union에 FIRE만 있어도 OK, FIRE+다른 속성 있어도 OK
 *  - target: "불,물"            → {FIRE, WATER}
 *    - union에 FIRE 있고 WATER 있으면 OK (부모 둘 중 누구에게 있든 상관 없음)
 */
object CombinationEngine {

    /**
     * 이 parent1, parent2가 target을 만들어낼 수 있는지 여부.
     */
    fun canProduce(
        target: UparuInfo,
        parent1: UparuInfo,
        parent2: UparuInfo
    ): Boolean {
        val targetSet = target.elements()
        if (targetSet.isEmpty()) return false

        val union = parent1.elements() union parent2.elements()
        if (union.isEmpty()) return false

        // 타겟 속성들이 전부 union 안에 포함되면 true
        return targetSet.all { it in union }
    }

    /**
     * target을 만들 수 있는 부모 조합 리스트를 반환.
     *
     * candidates: 조합에 사용할 수 있는 우파루들 (이벤트 제외 등 필터링해서 전달)
     *
     * 반환값: (부모1, 부모2) 쌍 리스트
     */
    fun recipesFor(
        target: UparuInfo,
        candidates: List<UparuInfo>
    ): List<Pair<UparuInfo, UparuInfo>> {

        val result = mutableListOf<Pair<UparuInfo, UparuInfo>>()
        val targetSet = target.elements()
        if (targetSet.isEmpty()) return emptyList()

        for (i in candidates.indices) {
            val p1 = candidates[i]
            for (j in i until candidates.size) { // (A,B)와 (B,A) 중복 방지
                val p2 = candidates[j]

                if (canProduce(target, p1, p2)) {
                    result += p1 to p2
                }
            }
        }

        return result
    }
}
