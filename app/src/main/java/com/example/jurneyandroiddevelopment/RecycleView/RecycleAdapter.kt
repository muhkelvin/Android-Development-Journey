package com.example.jurneyandroiddevelopment.RecycleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.jurneyandroiddevelopment.databinding.ItemRecycleBinding

class RecycleAdapter(val list:List<RecycleModel>):RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder>() {

    class RecycleViewHolder(val binding:ItemRecycleBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        return RecycleViewHolder(
            ItemRecycleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        val item = list[position]
        holder.binding.tvTitle.text = item.title
        holder.binding.tvDesc.text = item.desc
    }


}