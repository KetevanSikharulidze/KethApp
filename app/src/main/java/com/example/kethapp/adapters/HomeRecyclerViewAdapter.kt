package com.example.kethapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kethapp.databinding.ItemViewBinding
import com.example.kethapp.models.Item

class HomeRecyclerViewAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {

    inner class HomeViewHolder(private val binding: ItemViewBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: String){
            Glide.with(binding.root).load(item).into(binding.imageView)
            binding.textView.text = item
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = HomeViewHolder(ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: HomeRecyclerViewAdapter.HomeViewHolder, position: Int) {
        holder.bind(itemList[position].image!!)
        holder.bind(itemList[position].text!!)
    }

    override fun getItemCount() = itemList.size

}