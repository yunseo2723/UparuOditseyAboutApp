package com.uparu.uparumaking

import android.app.AlertDialog
import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class JohapListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CustomAdapterJohap
    private var fullJohapList: List<JohapData> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_johap_list)

        recyclerView = findViewById(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val changeName = intent.getStringExtra("changeName") ?: return
        val target = UparuRepository.findByName(changeName) ?: return

        val loadingDialog = AlertDialog.Builder(this)
            .setMessage(getString(R.string.loading_recipe))
            .setCancelable(false)
            .create()
        loadingDialog.show()

        lifecycleScope.launch(Dispatchers.Default) {
            val parentPairs = CombinationEngine.possibleParents(this@JohapListActivity, target)

            withContext(Dispatchers.Main) {
                loadingDialog.dismiss()

                fullJohapList = parentPairs.map { (p1, p2) ->
                    JohapData(
                        p1.profile,
                        p1.name,
                        R.drawable.plus,
                        p2.name,
                        p2.profile
                    )
                }

                adapter = CustomAdapterJohap(this@JohapListActivity, ArrayList(fullJohapList))
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
                // JohapData 안에 들어있는 이름 필드 이름에 맞게 수정!
                val leftName = item.name1   // 예시
                val rightName = item.name2 // 예시
                (lq.isEmpty() || leftName.contains(lq, ignoreCase = true)) &&
                        (rq.isEmpty() || rightName.contains(rq, ignoreCase = true))
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
