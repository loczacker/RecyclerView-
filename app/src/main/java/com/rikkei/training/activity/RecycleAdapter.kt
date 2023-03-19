package com.rikkei.training.activity

import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter : RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private var titles = arrayOf(
        "Chapter 1",
        "Chapter 2",
        "Chapter 3",
        "Chapter 4",
        "Chapter 5",
        "Chapter 6",
        "Chapter 7",
        "Chapter 8",
    )
    private var details = arrayOf(
        "Item 1 details",
        "Item 2 details",
        "Item 3 details",
        "Item 4 details",
        "Item 5 details",
        "Item 6 details",
        "Item 7 details",
        "Item 8 details",
    )
    private var images = intArrayOf(
        R.drawable.ic_android_foreground, R.drawable.ic_android_background,
        R.drawable.ic_android_foreground, R.drawable.ic_android_background,
        R.drawable.ic_android_foreground, R.drawable.ic_android_background,
        R.drawable.ic_android_foreground, R.drawable.ic_android_background,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size

    }

    inner

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }
}