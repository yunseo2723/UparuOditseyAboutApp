package com.uparu.uparumaking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.uparu.uparumaking.R

data class ListItem(val imageResId: Int, val name: String)

class UparuCategoryAdapter(
    private val context: Context,
    private val dataList: ArrayList<ListItem>
) : BaseAdapter() {

    override fun getCount(): Int = dataList.size
    override fun getItem(position: Int): ListItem = dataList[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.custom_list, parent, false)
            holder = ViewHolder(view.findViewById(R.id.iv_custom))
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val item = getItem(position)
        holder.profile.setImageResource(item.imageResId)

        return view
    }

    private class ViewHolder(val profile: ImageView)
}
