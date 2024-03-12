package com.uparu.uparumaking

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class Data(val profile:Int, val name:String)
data class JohapData(
    val imageResId1: Int,
    val name1: String,
    val plusResId: Int,
    val name2: String,
    val imageResId2: Int
)

class CustomAdapterJohap(
    val context: Context,
    val dataList: ArrayList<JohapData>
) : RecyclerView.Adapter<CustomAdapterJohap.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile1 = itemView.findViewById<ImageView>(R.id.img1)
        val name1 = itemView.findViewById<TextView>(R.id.txt1)
        val profile2 = itemView.findViewById<ImageView>(R.id.img2)
        val name2 = itemView.findViewById<TextView>(R.id.txt2)
        val profile3 = itemView.findViewById<ImageView>(R.id.img3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_johap_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.profile1.setImageResource(data.imageResId1)
        holder.name1.text = data.name1
        holder.profile2.setImageResource(data.plusResId)
        holder.name2.text = data.name2
        holder.profile3.setImageResource(data.imageResId2)
    }

    override fun getItemCount() = dataList.size
}
