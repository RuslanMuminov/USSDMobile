package com.example.ussdmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.R
import androidx.navigation.fragment.findNavController
import com.example.ussdmobile.adapter.ViewPagerAdapter
import com.example.ussdmobile.databinding.FragmentHomeBinding
import com.example.ussdmobile.databinding.FragmentInternetBinding
import com.example.ussdmobile.model.Model

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var list: List<Model>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        val adapter = ViewPagerAdapter(initList(), parentFragmentManager)
        binding.viewPager.adapter = adapter
        binding.tabLayout.setViewPager(binding.viewPager)

        binding.ussd.setOnClickListener {
            findNavController().navigate(com.example.ussdmobile.R.id.bannerFragment)
        }
        binding.tarif.setOnClickListener {
            findNavController().navigate(com.example.ussdmobile.R.id.definitionFragment)
        }
        binding.internet.setOnClickListener {
            findNavController().navigate(com.example.ussdmobile.R.id.internetFragment)
        }
        binding.sms.setOnClickListener {
            findNavController().navigate(com.example.ussdmobile.R.id.smsFragment)
        }
        binding.xizmat.setOnClickListener {
            findNavController().navigate(com.example.ussdmobile.R.id.servicesFragment)
        }
        binding.minut.setOnClickListener {
            findNavController().navigate(com.example.ussdmobile.R.id.ussdFragment)
        }

        return binding.root
    }

    private fun initList(): List<Model> {
        return listOf(
            Model("Milliy 10", "10 000 so'm oyiga", "10 SMS", "10 MIN", "10 MB"),
            Model("Milliy 15", "15 000 so'm oyiga", "500 SMS", "100 MIN", "500 MB"),
            Model("Milliy 40", "40 000 so'm oyiga", "3000 SMS", "Cheksiz*", "8 GB"),
            Model("Milliy 50", "50 000 so'm oyiga", "5000 SMS", "Cheksiz*", "12 GB"),
            Model("Milliy 70", "70 000 so'm oyiga", "5000 SMS", "Cheksiz*", "20 GB"),
            Model("Milliy 100", "100 000 so'm oyiga", "5000 SMS", "Cheksiz*", "35 GB"),
            Model("Milliy VIP", "150 000 so'm oyiga", "5000 SMS", "Cheksiz*", "Cheksiz*")
        )
    }
}