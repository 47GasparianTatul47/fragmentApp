package com.example.fragmentapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerView(val context: Context, val models: MutableList<Models>) :
    RecyclerView.Adapter<MyRecyclerView.CustomViewHolder>() {


    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textName: TextView
        val imageView: ImageView

        init {
            textName = view.findViewById(R.id.nameItem)
            imageView = view.findViewById(R.id.itemImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.m_itme, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.textName.text = models[position].title
        holder.imageView.setImageResource(models[position].image)

        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim_1)

        holder.textName.setOnClickListener {
            Toast.makeText(context, "${holder.textName.text}", Toast.LENGTH_SHORT).show()

        }
    }

    override fun getItemCount(): Int {
        return models.size
    }

    fun addItem(item: Models) {
        models.add(item)

        notifyDataSetChanged()
    }


    fun remove(item: Int) {
        models.removeAt(item)
        notifyDataSetChanged()
    }
}