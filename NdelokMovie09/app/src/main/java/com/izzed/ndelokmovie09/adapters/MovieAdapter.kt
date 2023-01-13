package com.izzed.ndelokmovie09.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.izzed.ndelokmovie09.Data
import com.izzed.ndelokmovie09.R

class MovieAdapter(private val movieList: ArrayList<Data>): RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = movieList[position]
        holder.itemName.text = currentItem.name
        holder.itemDetail.text = currentItem.detail
        holder.itemPoster.setImageResource(currentItem.poster)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_desc)
        val itemPoster: ShapeableImageView = itemView.findViewById(R.id.poster)
    }
}