package com.khush.moviesapp.ui

import android.media.RouteListingPreference
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.khush.moviesapp.R

class ViewPagerAdapter(private val items: List<ObjetoCreado>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    class ViewHolder(itemView: CardView) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val texto1: TextView = itemView.findViewById(R.id.texto1)
        val texto2: TextView = itemView.findViewById(R.id.texto2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_page, parent, false) as CardView
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        // Cargar imagen desde la URL con Glide
        Glide.with(holder.imageView.context)
            .load(item.imageUrl)
            .placeholder(R.drawable.ic_launcher_background)  // Imagen temporal mientras carga
            .error(R.drawable.ic_launcher_foreground)  // Imagen en caso de error
            .into(holder.imageView)

        holder.texto1.text = item.texto1
        holder.texto2.text = item.texto2
    }

    override fun getItemCount(): Int = items.size
}