package com.uparu.uparumaking

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.NumberFormat
import java.util.Locale

class MainActivity4 : AppCompatActivity() {

    private fun showPopupDialog(target: UparuInfo, popup: UparuPopup) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.popup_layout)

        val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
        val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
        val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
        val closeButton = dialog.findViewById<Button>(R.id.closeButton)

        popupImage.setImageResource(target.profile)
        textViewTitle.text = popup.title
        textViewContent.text = popup.message

        closeButton.setOnClickListener { dialog.dismiss() }

        dialog.show()
    }

    private fun formatSell(value: Int): String {
        if (value == 0) return "-" // 아직 안 넣은 애들 표시용, 필요없으면 지워도 됨
        val nf = NumberFormat.getInstance(Locale.KOREA)
        return nf.format(value)
    }

    private fun bindHeaderWithRepository(info: UparuInfo) {
        val uparuView = findViewById<ImageView>(R.id.uparuView)
        val typeView = findViewById<ImageView>(R.id.typeView)
        val eggView = findViewById<ImageView>(R.id.eggView)
        val nameView = findViewById<TextView>(R.id.nameView)
        val goldView = findViewById<TextView>(R.id.goldView)
        val habitatView = findViewById<TextView>(R.id.habitatView)
        val sellView = findViewById<TextView>(R.id.sellView)
        val timeView = findViewById<TextView>(R.id.timeView)

        nameView.text = info.name
        uparuView.setImageResource(info.profile)
        typeView.setImageResource(info.typeDrawable)
        eggView.setImageResource(info.egg)
        goldView.text = getString(R.string.gold_per_min, info.gold)
        habitatView.text = info.typeText
        sellView.text = formatSell(info.sell)
        timeView.text = info.timeDisplay
    }

    // 기본 먹이량 테이블
    private val baseFeed = intArrayOf(
        4, 8, 16, 40, 80, 160, 320, 640, 1280, 2560, 5120, 6400, 8400,
        12000, 16000, 20500, 25000, 35000, 50000, 65000, 82500, 100000,
        120000, 150000, 180000, 216000, 252000, 288000, 324000, 364000,
        412000, 460000, 512000, 568000, 632000, 696000, 768000, 844000,
        924000, 1012000, 1104000, 1200000, 1304000, 1416000, 0
    )

    /** 먹이 결과 값 묶음 */
    private data class FeedResult(
        val level: Int,
        val num: Int,
        val clickCount: Int,
        val feedSum: Int
    )

    /** 속성에 따라 먹이량 조정 (빛/어둠/황금/구름 → 2배) */
    private fun getFeedArrayForHabitat(habitat: String): IntArray {
        val copy = baseFeed.clone()
        if (habitat in listOf("빛", "어둠", "황금", "구름")) {
            for (i in copy.indices) copy[i] *= 2
        }
        return copy
    }

    /** 일반 레벨(1~44 전까지) 처리 */
    private fun handleFeedClick(
        feed: IntArray,
        progressBar: ProgressBar,
        levelView: TextView,
        feedView: TextView,
        feedNum: TextView,
        level: Int,
        num: Int,
        clickCount: Int,
        feedSum: Int
    ): FeedResult {

        var lv = level
        var n = num
        var clicks = clickCount
        var totalFeed = feedSum

        totalFeed += feed[n]
        feedView.text = getString(R.string.feed_total, totalFeed)

        val currentProgress = progressBar.progress
        if (currentProgress < 75) {
            progressBar.progress = currentProgress + 25
            clicks++
        } else {
            if (clicks < 3) {
                clicks++
            } else {
                // 4번째 클릭에서 레벨업
                progressBar.progress = 0
                clicks = 0
                lv++
                n++
                levelView.text = getString(R.string.level_format, lv)
                feedNum.text = feed[n].toString()
            }
        }

        return FeedResult(lv, n, clicks, totalFeed)
    }

    /** 44레벨 구간 처리 */
    private fun handleFeedClickAtMax(
        feed: IntArray,
        progressBar: ProgressBar,
        levelView: TextView,
        feedView: TextView,
        feedNum: TextView,
        level: Int,
        num: Int,
        clickCount: Int,
        feedSum: Int
    ): FeedResult {

        var lv = level
        var clicks = clickCount
        var totalFeed = feedSum

        totalFeed += feed[num]
        feedView.text = getString(R.string.feed_total, totalFeed)

        val currentProgress = progressBar.progress
        if (currentProgress < 75) {
            progressBar.progress = currentProgress + 25
            clicks++
        } else {
            if (clicks < 3) {
                clicks++
            } else {
                lv = 45
                levelView.text = getString(R.string.level_format, 45)
                feedNum.setText(R.string.max_level)
                progressBar.progress = 100
                clicks = 4
            }
        }

        return FeedResult(lv, num, clicks, totalFeed)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val changeName = intent.getStringExtra("changeName") ?: return
        val target = UparuRepository.findByName(changeName) ?: return

        val loadingDialog = AlertDialog.Builder(this)
            .setMessage(getString(R.string.loading_recipe))
            .setCancelable(false)
            .create()
        loadingDialog.show()
        // 🔹 백그라운드에서 조합 계산
        lifecycleScope.launch(Dispatchers.Default) {
            val parentPairs = CombinationEngine.possibleParents(this@MainActivity4, target)

            // 🔹 계산이 끝나면 UI 업데이트
            withContext(Dispatchers.Main) {
                loadingDialog.dismiss()

                bindHeaderWithRepository(target)

                val johapList = parentPairs.map { (p1, p2) ->
                    JohapData(
                        p1.profile,
                        p1.name,
                        R.drawable.plus,
                        p2.name,
                        p2.profile
                    )
                }
                //조합법 연결
                recyclerView.adapter = CustomAdapterJohap(this@MainActivity4, ArrayList(johapList))

                if (target.isStar || target.isEvent) {
                    UparuPopupRepository.get(target.name)?.let { popup ->
                        showPopupDialog(target, popup)
                    }
                }

                //먹이량 계산
                val progressBar = findViewById<ProgressBar>(R.id.progressBar)
                val levelView = findViewById<TextView>(R.id.levelView)
                val feedView = findViewById<TextView>(R.id.feedView)
                val feedNum = findViewById<TextView>(R.id.feedNum)
                val feedButton = findViewById<ImageButton>(R.id.feedButton)
                val habitatView = findViewById<TextView>(R.id.habitatView)

                // 기본값 초기화
                var level = 1
                var clickCount = 0
                var feedSum = 0
                var num = 0
                progressBar.progress = 0

                levelView.text = getString(R.string.level_format, level)
                feedView.text = getString(R.string.feed_total, feedSum)


                // habitat(속성)에 따라 2배 계산 (빛/어둠/황금/구름)
                val habitat = habitatView.text.toString()
                val feed = getFeedArrayForHabitat(habitat)

                feedNum.text = feed[num].toString()

                feedButton.setOnClickListener {
                    when {
                        level < 44 -> {
                            val result = handleFeedClick(
                                feed, progressBar, levelView, feedView, feedNum,
                                level, num, clickCount, feedSum
                            )
                            level = result.level
                            num = result.num
                            clickCount = result.clickCount
                            feedSum = result.feedSum
                        }

                        level == 44 -> {
                            val result = handleFeedClickAtMax(
                                feed, progressBar, levelView, feedView, feedNum,
                                level, num, clickCount, feedSum
                            )
                            level = result.level
                            clickCount = result.clickCount
                            feedSum = result.feedSum
                        }
                    }
                }
            }
        }
    }
}