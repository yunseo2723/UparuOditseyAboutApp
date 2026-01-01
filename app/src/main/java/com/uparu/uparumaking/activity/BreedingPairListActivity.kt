package com.uparu.uparumaking.activity

import android.app.AlertDialog
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.SearchView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uparu.uparumaking.adapter.BreedingPairAdapter
import com.uparu.uparumaking.etc.BreedingPairItem
import com.uparu.uparumaking.etc.CombinationEngine
import com.uparu.uparumaking.R
import com.uparu.uparumaking.UparuRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BreedingPairListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: BreedingPairAdapter
    private var fullJohapList: List<BreedingPairItem> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeding_pair_list)

        recyclerView = findViewById(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val changeName = intent.getStringExtra("changeName") ?: return
        val target = UparuRepository.findByName(changeName) ?: return

        // 🔹 커스텀 로딩 다이얼로그 생성
        val loadingView = layoutInflater.inflate(R.layout.dialog_loading_breeding, null)
        val loadingBar = loadingView.findViewById<ProgressBar>(R.id.progressBarLoading)
        val loadingPercent = loadingView.findViewById<TextView>(R.id.tvLoadingPercent)

        loadingBar.max = 100
        loadingBar.progress = 0
        loadingPercent.text = getString(R.string.loading_breeding_percent, 0)

        val loadingDialog = AlertDialog.Builder(this)
            .setView(loadingView)
            .setCancelable(false)
            .create()
        loadingDialog.show()

        lifecycleScope.launch(Dispatchers.Default) {
            val parentPairs = CombinationEngine.possibleParents(
                context = this@BreedingPairListActivity,
                target = target,
                candidates = UparuRepository.nostar,
                onProgress = { percent ->
                    runOnUiThread {
                        loadingBar.progress = percent
                        loadingPercent.text = getString(R.string.loading_percent, percent)
                    }
                }
            )

            withContext(Dispatchers.Main) {
                loadingDialog.dismiss()

                fullJohapList = parentPairs.map { (p1, p2) ->
                    BreedingPairItem(
                        p1.profile,
                        p1.name,
                        R.drawable.plus,
                        p2.name,
                        p2.profile
                    )
                }

                adapter =
                    BreedingPairAdapter(this@BreedingPairListActivity, ArrayList(fullJohapList))
                recyclerView.adapter = adapter

                setupSearch()
            }
        }
    }

    private fun setupSearch() {
        val searchLeft = findViewById<SearchView>(R.id.searchViewLeft)
        val searchRight = findViewById<SearchView>(R.id.searchViewRight)

        searchLeft.setIconifiedByDefault(false)
        searchRight.setIconifiedByDefault(false)

        var leftQuery = ""
        var rightQuery = ""

        fun applyFilter() {
            val lq = leftQuery.trim()
            val rq = rightQuery.trim()

            val filtered = fullJohapList.filter { item ->
                val leftName = item.name1
                val rightName = item.name2

                val leftMatch =
                    lq.isEmpty() ||
                            leftName.contains(lq, ignoreCase = true) ||
                            rightName.contains(lq, ignoreCase = true)

                val rightMatch =
                    rq.isEmpty() ||
                            leftName.contains(rq, ignoreCase = true) ||
                            rightName.contains(rq, ignoreCase = true)

                leftMatch && rightMatch
            }
            adapter.submitList(filtered)
        }

        searchLeft.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?) = true
            override fun onQueryTextChange(newText: String?): Boolean {
                leftQuery = newText.orEmpty()
                applyFilter()
                return true
            }
        })

        searchRight.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?) = true
            override fun onQueryTextChange(newText: String?): Boolean {
                rightQuery = newText.orEmpty()
                applyFilter()
                return true
            }
        })
    }
}
