package com.example.coupangeats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.coupangeats.databinding.FragmentHomeBinding
import com.example.coupangeats.databinding.ItemFoodtypeBinding
import com.example.flo.BannerViewpagerAdapter
import com.google.gson.Gson




class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.homeFoodtypeRecyclerview.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val foodtypeRVAdapter = FoodTypeRVAdapter()
        binding.homeFoodtypeRecyclerview.adapter = foodtypeRVAdapter

        val recommendRV1Adapter = RecommendRV1Adapter()
        binding.homeStore1Recyclerview.adapter = recommendRV1Adapter

        val recommendRV2Adapter = RecommendRV2Adapter()
        binding.homeStore2Recyclerview.adapter = recommendRV2Adapter

        val recommendRV3Adapter = RecommendRV3Adapter()
        binding.homeStore3Recyclerview.adapter = recommendRV3Adapter

        val choosestoreRVAdapter = ChooseStoreRVAdapter()
        binding.homeStore4Recyclerview.adapter = choosestoreRVAdapter



        val bannerAdapter = BannerViewpagerAdapter(this)
        bannerAdapter.addFragment(BannerFragment(R.drawable.banner))// 프래그먼트
        bannerAdapter.addFragment(BannerFragment(R.drawable.banner))
        bannerAdapter.addFragment(BannerFragment(R.drawable.banner))

        binding.homeBannerVp.adapter = bannerAdapter
        binding.homeBannerVp.orientation = ViewPager2.ORIENTATION_HORIZONTAL


        return binding.root
    }

}