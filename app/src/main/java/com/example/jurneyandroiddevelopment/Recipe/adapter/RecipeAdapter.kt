package com.example.jurneyandroiddevelopment.Recipe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jurneyandroiddevelopment.databinding.ItemRecipeBinding
import com.example.jurneyandroiddevelopment.databinding.ItemRecycleBinding

class RecipeAdapter(private val recipes: List<RecipeModel>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(val binding: ItemRecipeBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeAdapter.RecipeViewHolder {
        return RecipeViewHolder(
            ItemRecipeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecipeAdapter.RecipeViewHolder, position: Int) {
    val recipe = recipes[position]
        holder.binding.tvLabel.text = recipe.label
        holder.binding.tvValue.text = recipe.value
    }

    override fun getItemCount(): Int {
        return recipes.size
    }
}