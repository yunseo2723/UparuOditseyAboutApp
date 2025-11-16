package com.uparu.uparumaking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.uparu.uparumaking.R

class ElementDialogAdapter(private val context: Context, private val items: List<Pair<Int, String>>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_dialog_item, null)

        val itemImageView = view.findViewById<ImageView>(R.id.dialogImageView)
        val itemTextView = view.findViewById<TextView>(R.id.dialogTextView)

        val item = items[position]
        itemImageView.setImageResource(item.first)
        itemTextView.text = item.second

        return view
    }
}

