package com.uparu.uparumaking.activity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.uparu.uparumaking.adapter.ElementDialogAdapter
import com.uparu.uparumaking.adapter.ListItem
import com.uparu.uparumaking.adapter.UparuCategoryAdapter
import com.uparu.uparumaking.etc.Element
import com.uparu.uparumaking.R
import com.uparu.uparumaking.etc.UparuInfo
import com.uparu.uparumaking.UparuRepository

class ElementSelectActivity : AppCompatActivity() {
    private val menu: List<Pair<ListItem, Element>> = listOf(
        ListItem(R.drawable.star1, "Star") to Element.STAR,
        ListItem(R.drawable.cloud1, "Cloud") to Element.CLOUD,
        ListItem(R.drawable.grass1, "Grass") to Element.GRASS,
        ListItem(R.drawable.ground1, "Ground") to Element.GROUND,
        ListItem(R.drawable.fire1, "Fire") to Element.FIRE,
        ListItem(R.drawable.water1, "Water") to Element.WATER,
        ListItem(R.drawable.lightning1, "Lightning") to Element.LIGHTNING,
        ListItem(R.drawable.wind1, "Wind") to Element.WIND,
        ListItem(R.drawable.ice1, "Ice") to Element.ICE,
        ListItem(R.drawable.magic1, "Magic") to Element.MAGIC
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element_select)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                startActivity(Intent(this@ElementSelectActivity, HomeActivity::class.java))
                finishAffinity()
                @Suppress("DEPRECATION")
                overridePendingTransition(0, 0)
            }
        })

        val listView = findViewById<ListView>(R.id.listView)
        // 어댑터에는 ListItem만 전달
        val menuItems = ArrayList(menu.map { it.first })
        listView.adapter = UparuCategoryAdapter(this, menuItems)

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val element = menu[position].second
            showElementDialog(element)
        }

        findViewById<ImageButton>(R.id.button2).setOnClickListener {
            startActivity(Intent(this, UparuListActivity::class.java))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }

    /** 요소별 다이얼로그 호출 */
    private fun showElementDialog(element: Element) {
        val items = dialogItemsFor(element)
        showCustomDialog(items)
    }

    /** 요소별 필터링: Repository에서 자동 생성 */
    private fun dialogItemsFor(element: Element): List<Pair<Int, String>> {
        fun matches(info: UparuInfo, e: Element): Boolean {
            val t = info.typeText
            return when (e) {
                Element.STAR      -> t.contains("빛") || t.contains("어둠") || t.contains("황금")
                Element.CLOUD     -> t.contains("구름") || info.typeDrawable == R.drawable.typecloud

                Element.LIGHT     -> t.contains("빛")   || info.typeDrawable == R.drawable.typelight
                Element.DARK      -> t.contains("어둠") || info.typeDrawable == R.drawable.typedark
                Element.GOLD      -> t.contains("황금") || info.typeDrawable == R.drawable.typegold

                Element.GRASS     -> t.contains("숲")
                Element.GROUND    -> t.contains("땅")
                Element.FIRE      -> t.contains("불")
                Element.WATER     -> t.contains("물")
                Element.LIGHTNING -> t.contains("천둥")
                Element.WIND      -> t.contains("바람")
                Element.ICE       -> t.contains("얼음")
                Element.MAGIC     -> t.contains("매직")
            }
        }

        return UparuRepository.all
            .asSequence()
            .filter { matches(it, element) }
            .sortedBy { it.name }
            .map { it.profile to it.name }
            .toList()
    }

    /** 공통 다이얼로그 */
    private fun showCustomDialog(items: List<Pair<Int, String>>) {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog_layout, null)
        val dialogListView = dialogView.findViewById<ListView>(R.id.dialogListView)

        val adapter = ElementDialogAdapter(this, items)
        dialogListView.adapter = adapter

        val dialog = AlertDialog.Builder(this).setView(dialogView).create()
        dialog.show()

        dialogListView.setOnItemClickListener { _, _, position, _ ->
            val (_, name) = items[position]
            startActivity(Intent(this, UparuDetailActivity::class.java).putExtra("changeName", name))
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
            dialog.dismiss()
        }
    }
}