package com.example.coupangeats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.coupangeats.databinding.FragmentOrderlistBinding


class OrderlistFragment: Fragment() {
    lateinit var binding: FragmentOrderlistBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOrderlistBinding.inflate(inflater,container,false)


        return binding.root
    }

}