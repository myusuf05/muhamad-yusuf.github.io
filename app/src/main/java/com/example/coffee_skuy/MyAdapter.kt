package com.example.coffee_skuy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val menuList : ArrayList<Menu>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>()  {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
            val tvHeading: TextView = itemView.findViewById(R.id.tvHeading)
            val tvHarga: TextView = itemView.findViewById(R.id.tvharga)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = menuList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
        holder.tvHarga.text = currentItem.heading

    }

    override fun getItemCount(): Int {
        return menuList.size

    }
}