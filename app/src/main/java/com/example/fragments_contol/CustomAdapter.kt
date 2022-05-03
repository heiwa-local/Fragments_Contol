package com.example.fragments_contol

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val colorNames: Array<String>, private val colorValues: IntArray,private var viewModel: MyViewModel):
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewName: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val person : String = colorNames[position]
        holder.textViewName.setBackgroundColor(colorValues[position])

        holder.textViewName.text = person
        holder.textViewName.setOnClickListener {
            viewModel.onClickBtn(colorValues[position])
        }
    }

    override fun getItemCount() = colorValues.size
}