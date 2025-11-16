package com.uparu.uparumaking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uparu.uparumaking.R

class TypeTimeItem(val profile:Int, val name:String, val egg:Int, val type:String, val time:String)

class TypeTimeAdapter(val context: Context, var dataList: ArrayList<TypeTimeItem>) :
    RecyclerView.Adapter<TypeTimeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile: ImageView = itemView.findViewById(R.id.uparu)
        val name: TextView = itemView.findViewById(R.id.name)
        val egg: ImageView = itemView.findViewById(R.id.egg1)
        val type: TextView = itemView.findViewById(R.id.type)
        val time: TextView = itemView.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_time_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.profile.setImageResource(data.profile)
        holder.name.text =data.name
        holder.egg.setImageResource(data.egg)
        holder.type.text =data.type
        holder.time.text = data.time
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
