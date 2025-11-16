package com.uparu.uparumaking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uparu.uparumaking.etc.BreedingPairItem
import com.uparu.uparumaking.R

class BreedingPairAdapter(
    val context: Context,
    val dataList: ArrayList<BreedingPairItem>
) : RecyclerView.Adapter<BreedingPairAdapter.ViewHolder>() {

    fun submitList(newList: List<BreedingPairItem>) {
        dataList.clear()
        dataList.addAll(newList)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile1: ImageView = itemView.findViewById(R.id.img1)
        val name1: TextView = itemView.findViewById(R.id.txt1)
        val profile2: ImageView = itemView.findViewById(R.id.img2)
        val name2: TextView = itemView.findViewById(R.id.txt2)
        val profile3: ImageView = itemView.findViewById(R.id.img3)
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
