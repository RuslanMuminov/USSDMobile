package com.example.ussdmobile.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.ussdmobile.fragments.DataFragment
import com.example.ussdmobile.model.Model

class ViewPagerAdapter(private val list: List<Model>, fm: FragmentManager): FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return DataFragment.newInstance(list[position])
    }
    
}