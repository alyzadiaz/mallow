package adr.squish.ui.explore

import adr.squish.R
import adr.squish.Squishmallow
import adr.squish.ui.explore.RecyclerAdapter.CustomViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val squishes: List<Squishmallow>) :
    RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val squish = squishes[position]
        holder.label.text = squish.name
        holder.img.setBackgroundResource(squish.image)
    }

    override fun getItemCount(): Int {
        return squishes.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.squish_img)
        val label: TextView = itemView.findViewById(R.id.squish_name)

    }
}