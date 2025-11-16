package com.uparu.uparumaking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.uparu.uparumaking.R

class UparuGridItem(val profile:Int, val name:String, val gold:Int, val type:Int, val time:Double)

class UparuGridAdapter(val context: Context, var dataList: List<UparuGridItem>) : BaseAdapter()
{
    override fun getCount() = dataList.size

    override fun getItem(position: Int) = dataList[position]

    override fun getItemId(position: Int) = 0L

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.custom_list2, parent, false)

        val profile = view.findViewById<ImageView>(R.id.iv_custom)
        val name = view.findViewById<TextView>(R.id.tv_custom)
        val gold = view.findViewById<TextView>(R.id.gold_custom)
        val type = view.findViewById<ImageView>(R.id.type_custom)
        val time = view.findViewById<TextView>(R.id.time_custom)

        val data = dataList[position]

        profile.setImageResource(data.profile)
        name.text = data.name
        gold.text = data.gold.toString()
        type.setImageResource(data.type)
        time.text = data.time.toString()

        return view
    }
}