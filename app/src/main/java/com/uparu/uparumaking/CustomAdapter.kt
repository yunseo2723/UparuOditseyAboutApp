package com.uparu.uparumaking

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

//class Data(val profile:Int, val name:String)
data class Data(val imageResId: Int, val name: String)

class CustomAdapter(val context: Context, val DataList: ArrayList<Data>) : BaseAdapter()
{
    override fun getCount() = DataList.size

    override fun getItem(position: Int) = DataList[position]

    override fun getItemId(position: Int) = 0L

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = LayoutInflater.from(context).inflate(R.layout.custom_list, null)
        val profile = view.findViewById<ImageView>(R.id.iv_custom)
        //val name = view.findViewById<TextView>(R.id.tv_custom)
        val data = DataList[position]

        profile.setImageResource(data.imageResId)
        //name.text = data.name
        return view

    }
}