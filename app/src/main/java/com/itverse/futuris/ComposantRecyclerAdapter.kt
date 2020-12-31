package com.itverse.futuris

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComposantRecyclerAdapter(context: Context, private val composants: LinkedHashMap<String, ComposantData>):
    RecyclerView.Adapter<ComposantRecyclerAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val composantImg: ImageView = itemView.findViewById<ImageView>(R.id.composantImg)
        val composantText: TextView = itemView.findViewById<TextView>(R.id.composantText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.composant_item, parent,false)
        return  ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val keys = composants.keys.toList()
        val composant = composants[keys[position]]!!
        holder.composantImg.setImageResource(composant.imageResource)
        holder.composantText.text = composant.name

    }

    override fun getItemCount() = composants.size

}