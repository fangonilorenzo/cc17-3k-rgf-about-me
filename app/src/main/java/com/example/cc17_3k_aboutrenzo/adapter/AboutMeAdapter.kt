package com.example.cc17_3k_aboutrenzo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3k_aboutrenzo.R
import com.example.cc17_3k_aboutrenzo.model.AboutMe

class AboutMeAdapter(val data: List<AboutMe>):
    RecyclerView.Adapter<AboutMeAdapter.AboutMeItemViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): AboutMeItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.about_me_item_view, parent, false)
        return AboutMeItemViewHolder(layout)

    }

    override fun onBindViewHolder(
        holder: AboutMeItemViewHolder,
        position: Int,
    ) {
        holder.aboutMeItemImageView.setImageResource(data.get(position).imageResId)
        holder.aboutMeNameTextView.text = data.get(position).name
        holder.aboutMeDescTextView.text = data.get(position).desc
        holder.aboutMeShowMoreButton.setOnClickListener(data.get(position).onClickListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class AboutMeItemViewHolder(val row: View): RecyclerView.ViewHolder(row){
        val aboutMeItemImageView = row.findViewById<ImageView>(R.id.aboutMeItemImage)
        val aboutMeNameTextView = row.findViewById<TextView>(R.id.AboutMeItemName)
        val aboutMeDescTextView = row.findViewById<TextView>(R.id.AboutMeItemDesc)
        val aboutMeShowMoreButton = row.findViewById<Button>(R.id.aboutMeItemShowMoreButton)

    }

}