package com.example.coupangeats

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coupangeats.databinding.ItemFoodtypeBinding
import com.example.coupangeats.databinding.ItemStore2Binding

class ChooseStoreRVAdapter: RecyclerView.Adapter<ChooseStoreRVAdapter.ViewHolder>() {


    //뷰홀더 생성->호출되는 함수->아이템 뷰 객체를 만들어서 뷰홀더에 던져줌
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding:ItemStore2Binding= ItemStore2Binding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    //뷰홀더에 데이터를 바인딩해줘야 할 때마다 호출되는 함수 => 엄청나게 많이 호출
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    //뷰홀더
    inner class ViewHolder(val binding: ItemStore2Binding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
        }

    }

    override fun getItemCount(): Int {
        return 8
    }
}