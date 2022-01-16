package com.example.ussdmobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussdmobile.R
import com.example.ussdmobile.databinding.ExpansionItemInternetBinding
import com.example.ussdmobile.model.ExpInterMod

class InternetAdapter(var list: List<ExpInterMod>): RecyclerView.Adapter<InternetAdapter.ViewHolder>(){

    inner class ViewHolder(private var binding: ExpansionItemInternetBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(expInterMod: ExpInterMod) {
            binding.textExpName.text = expInterMod.name.toString()
            binding.textExpName1.text = expInterMod.name1.toString()
            binding.textExpDesc.text = expInterMod.desc.toString()
            expInterMod.image?.let { binding.imageExp.setImageResource(it.toInt()) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ExpansionItemInternetBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}