package com.example.ussdmobile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussdmobile.R
import com.example.ussdmobile.databinding.ExpansionalItemBinding
import com.example.ussdmobile.model.ExpModel

class RecyclerAdapter(var list: List<ExpModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ExpansionalItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun onBind(expModel: ExpModel, position: Int) {
            binding.textExpName.text = expModel.name.toString()
            binding.textExpDesc.text = expModel.desc.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ExpansionalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }



    override fun getItemCount(): Int = list.size

}