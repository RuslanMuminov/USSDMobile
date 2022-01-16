package com.example.ussdmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdmobile.R
import com.example.ussdmobile.databinding.FragmentDataBinding
import com.example.ussdmobile.model.Model
import java.io.Serializable

private const val ARG_PARAM1 = "param1"

class DataFragment : Fragment() {

    private var param1: Serializable? = null
    private lateinit var binding: FragmentDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getSerializable(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDataBinding.inflate(layoutInflater, container, false)

        val model = param1 as Model
        binding.name.text = model.name
        binding.sum.text = model.month
        binding.MIN.text = model.min
        binding.MB.text = model.mb
        binding.SMS.text = model.sms

        return binding.root
    }

    companion object {

        fun newInstance(param1: Model) =
            DataFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
                }
            }
    }
}