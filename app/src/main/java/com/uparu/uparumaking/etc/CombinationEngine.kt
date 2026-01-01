package com.uparu.uparumaking.etc

import android.content.Context
import com.uparu.uparumaking.adapter.TypeTimeItem
import kotlinx.coroutines.yield

object CombinationEngine {

    // ---------- 1. 타입 조합 ----------
    private fun generateCombinations(str: String?): List<String> {
        val options = mutableListOf<String>()
        if (str != null) {
            listOf("숲","땅","불","물","천둥","바람","얼음","매직","슈가","강철")
                .forEach { if (str.contains(it)) options.add(it) }
        }
        if (options.isEmpty()) return emptyList()
        if (options.size == 1) return options

        val result = mutableSetOf<String>()
        val n = options.size

        fun <T> perm(list: List<T>): List<List<T>> =
            if (list.size <= 1) listOf(list)
            else list.flatMap { e ->
                perm(list - e).map { listOf(e) + it }
            }

        for (i in 1 until (1 shl n)) {
            val subset = options.filterIndexed { idx, _ -> i and (1 shl idx) != 0 }
            result += subset.joinToString(",")
            if (subset.size <= 3) perm(subset).forEach {
                result += it.joinToString(",")
            }
        }
        return result.toList()
    }

    // ---------- 2. 룰 엔진 ----------
    private data class BreedContext(
        val rare: Int,
        val typeCount: Int,
        val types: Set<String>,
        val makingYongaru: Boolean
    )

    private data class BreedRule(
        val minRare: Int = 0,
        val exactRare: Int? = null,
        val minTypes: Int,
        val requireAll: Set<String> = emptySet(),
        val requireAny: Set<String> = emptySet(),
        val results: Set<String>
    ) {
        fun matches(ctx: BreedContext): Boolean {
            if (exactRare != null && ctx.rare != exactRare) return false
            if (ctx.rare < minRare) return false
            if (ctx.typeCount < minTypes) return false
            if (!ctx.types.containsAll(requireAll)) return false
            if (requireAny.isNotEmpty() && requireAny.none { ctx.types.contains(it) }) return false
            return true
        }
    }

    // ---------- 3. 룰 테이블 ----------
    private val RULES = listOf(

        // 레이, 쉐도우 : 레어 X, 4+, 물 or 바람
        BreedRule(
            exactRare = 0,
            minTypes = 4,
            requireAny = setOf("물", "바람"),
            results = setOf("rey", "shadow")
        ),

        // 루핀, 골디, 레오 : 레어 1+, 4+
        BreedRule(
            minRare = 1,
            minTypes = 4,
            results = setOf("rupin", "goldi", "leo")
        ),

        // 다크골디 : 레어 2+, 2+
        BreedRule(
            minRare = 2,
            minTypes = 2,
            results = setOf("darkgoldi")
        ),

        // 크로노, 고대신룡, 다크닉스, 클라우 : 5+
        BreedRule(
            minTypes = 5,
            results = setOf(
                "krono",
                "godaesinyong",
                "darknicks",
                "clau"
            )
        ),

        // 루미온 : 4+, 숲+땅
        BreedRule(
            minTypes = 4,
            requireAll = setOf("숲", "땅"),
            results = setOf("rumion2")
        ),

        // 치우
        BreedRule(
            minTypes = 4,
            requireAll = setOf("얼음", "바람"),
            results = setOf("chiu")
        ),

        // 홀리
        BreedRule(
            minTypes = 4,
            requireAll = setOf("물", "천둥"),
            results = setOf("holi")
        ),

        // 벨누스
        BreedRule(
            minTypes = 4,
            requireAll = setOf("얼음", "천둥"),
            results = setOf("belnus")
        ),

        // 글로리, 글로리아
        BreedRule(
            minTypes = 4,
            requireAll = setOf("바람", "불"),
            results = setOf("glori", "gloria")
        ),

        // 루루
        BreedRule(
            minTypes = 4,
            requireAll = setOf("불", "매직", "바람"),
            results = setOf("ruru", "glori", "gloria")
        ),

        // 슈미
        BreedRule(
            minTypes = 4,
            requireAll = setOf("땅", "슈가", "얼음"),
            results = setOf("shumi")
        ),

        // 블랙아피스
        BreedRule(
            minTypes = 5,
            requireAll = setOf("땅", "천둥"),
            results = setOf("blackapis2", "krono", "godaesinyong", "darknicks", "clau")
        ),

        // 카일
        BreedRule(
            minTypes = 5,
            requireAll = setOf("물", "바람"),
            results = setOf("kail")
        ),

        // 아르코, 레인
        BreedRule(
            minTypes = 5,
            requireAll = setOf("물"),
            results = setOf("rain", "arco")
        ),

        // 브릴, 해치루, 해태루
        BreedRule(
            minTypes = 5,
            requireAll = setOf("바람"),
            results = setOf("bril", "hachiru", "hataru")
        ),

        // 샤벨 계열
        BreedRule(
            minRare = 1,
            minTypes = 5,
            results = setOf(
                "shabel",
                "plodi",
                "plodine",
                "pores",
                "poresti",
                "arne",
                "arsis"
            )
        )
    )

    // ---------- 4. 부모 → 자식 ----------
    fun possibleChildrenTypeTimeItem(
        context: Context,
        parent1ResId: Int,
        parent2ResId: Int,
        parentType1: String?,
        parentType2: String?,
        allChildrenTypeTimeItem: List<TypeTimeItem>
    ): ArrayList<TypeTimeItem> {

        val uparu1 = context.resources.getResourceEntryName(parent1ResId)
        val uparu2 = context.resources.getResourceEntryName(parent2ResId)

        val resulttype = generateCombinations(parentType1 + parentType2)
        val typenum = ("$parentType1,$parentType2").split(",").distinct().size

        val rareList = setOf(
            "yuni","bongbong","penriru","foxy","chepy","bau","boradoru","cray",
            "hermi","rudol","kota2","alpha","toibo","dumpti","chao","soti",
            "bomsopungbonobono","yoho","myti2","snepi","ebinu","capi"
        )

        val rareCount =
            (if (uparu1 in rareList) 1 else 0) +
                    (if (uparu2 in rareList) 1 else 0)

        val types = setOfNotNull(
            "숲".takeIf { resulttype.contains("숲") },
            "땅".takeIf { resulttype.contains("땅") },
            "불".takeIf { resulttype.contains("불") },
            "물".takeIf { resulttype.contains("물") },
            "바람".takeIf { resulttype.contains("바람") },
            "얼음".takeIf { resulttype.contains("얼음") },
            "천둥".takeIf { resulttype.contains("천둥") },
            "매직".takeIf { resulttype.contains("매직") },
            "슈가".takeIf { resulttype.contains("슈가") },
            "강철".takeIf { resulttype.contains("강철") }
        )

        val ctx = BreedContext(
            rare = rareCount,
            typeCount = typenum,
            types = types,
            makingYongaru = types.containsAll(setOf("불","물"))
        )

        val impossible =
            (uparu1 == uparu2 && typenum == 3) ||
                    (uparu1 == "randomegg" || uparu2 == "randomegg")

        return allChildrenTypeTimeItem.filter { data ->
            val childName =
                context.resources.getResourceEntryName(data.profile)

            if (impossible) return@filter false
            if (uparu1 == uparu2) return@filter data.profile == parent1ResId

            val matchedRules = RULES.filter { it.matches(ctx) }

            val allowed = matchedRules
                .flatMap { it.results }
                .toMutableSet()

            if (ctx.makingYongaru) allowed += "yongaru"

            childName in allowed || resulttype.contains(data.type)
        } as ArrayList<TypeTimeItem>
    }

    // ---------- 5. 결과 → 부모 ----------
    private val pairCache = mutableMapOf<Pair<Int, Int>, List<TypeTimeItem>>()

    suspend fun possibleParents(
        context: Context,
        target: UparuInfo,
        candidates: List<UparuInfo>,
        onProgress: ((Int) -> Unit)? = null
    ): List<Pair<UparuInfo, UparuInfo>> {

        val allChildren =
            com.uparu.uparumaking.UparuRepository.all.map { it.toTypeTimeItem() }

        val result = mutableListOf<Pair<UparuInfo, UparuInfo>>()
        val total = candidates.size * (candidates.size + 1) / 2
        var count = 0

        for (i in candidates.indices) {
            for (j in i until candidates.size) {
                count++
                if (count % 20 == 0) {
                    onProgress?.invoke((count * 100 / total).coerceIn(0, 100))
                    yield()
                }

                val p1 = candidates[i]
                val p2 = candidates[j]
                val key = minOf(p1.profile, p2.profile) to maxOf(p1.profile, p2.profile)

                val children = pairCache.getOrPut(key) {
                    possibleChildrenTypeTimeItem(
                        context,
                        p1.profile,
                        p2.profile,
                        p1.typeText,
                        p2.typeText,
                        allChildren
                    )
                }

                if (children.any { it.profile == target.profile }) {
                    result += p1 to p2
                }
            }
        }
        onProgress?.invoke(100)
        return result
    }
}
