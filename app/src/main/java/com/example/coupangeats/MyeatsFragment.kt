package com.example.coupangeats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.coupangeats.databinding.FragmentMyeatsBinding


class MyeatsFragment: Fragment() {
    lateinit var binding: FragmentMyeatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyeatsBinding.inflate(inflater,container,false)


        return binding.root
    }

}