package com.example.recyclerviewhomework2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework2.R
import com.example.recyclerviewhomework2.model.Shoes
import kotlinx.android.synthetic.main.item_shoes.view.*

class ShoesAdapter(var shoesList : ArrayList<Shoes>):
RecyclerView.Adapter<ShoesAdapter.ShoesViewHolder>()
{
    inner class ShoesViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView)
    {
        fun bindShoes(shoes: Shoes){
            itemView.itemCode.text = shoes.itemCode
            itemView.itemPicture.setImageResource(shoes.itemPicture)
            itemView.itemName.text = shoes.itemName
            itemView.itemModel.text = shoes.itemModel
            itemView.itemPrice.text = shoes.itemPrice
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoesViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_shoes,parent,false)
        return ShoesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoesList.size

    }

    override fun onBindViewHolder(holder: ShoesViewHolder, position: Int) {
        holder.bindShoes(shoesList[position])
    }
}