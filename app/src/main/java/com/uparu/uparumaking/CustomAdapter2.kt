package com.uparu.uparumaking

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Data2(val profile:Int, val name:String, val gold:Int, val type:Int, val time:Double)

class CustomAdapter2(val context: Context, var DataList: List<Data2>) : BaseAdapter()
{
    override fun getCount() = DataList.size

    override fun getItem(position: Int) = DataList[position]

    override fun getItemId(position: Int) = 0L

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = LayoutInflater.from(context).inflate(R.layout.custom_list2, null)
        val profile = view.findViewById<ImageView>(R.id.iv_custom)
        val name = view.findViewById<TextView>(R.id.tv_custom)
        val gold = view.findViewById<TextView>(R.id.gold_custom)
        val type = view.findViewById<ImageView>(R.id.type_custom)
        val time = view.findViewById<TextView>(R.id.time_custom)
        val data = DataList[position]

        profile.setImageResource(data.profile)
        name.text = data.name
        gold.text = data.gold.toString()
        type.setImageResource(data.type)
        time.text = data.time.toString()
        return view


    }

    // 데이터 목록 업데이트 메서드
    fun updateDataList(newDataList: List<Data2>) {
        DataList = newDataList as ArrayList<Data2>
        notifyDataSetChanged()
    }
}