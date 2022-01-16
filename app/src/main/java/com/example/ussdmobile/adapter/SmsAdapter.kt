package com.example.ussdmobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussdmobile.R
import com.example.ussdmobile.databinding.ExpansionItemSmsBinding
import com.example.ussdmobile.model.ExpSmsMod

class SmsAdapter(var list: List<ExpSmsMod>) : RecyclerView.Adapter<SmsAdapter.ViewHolder>(){

    inner class ViewHolder(private var binding: ExpansionItemSmsBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(expSmsMod: ExpSmsMod) {
            binding.textExpName.text = expSmsMod.name.toString()
            binding.textExpName1.text = expSmsMod.name1.toString()
            binding.textExpDesc.text = expSmsMod.desc.toString()
            expSmsMod.image?.let { binding.imageExp.setImageResource(it.toInt()) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ExpansionItemSmsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}