package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder




// 데이터 형식
class Data(val profile: Int, val name: String)

//  리사이클러뷰 한 화면에서 나타내는 것을 개수?를 말한다
class CustomViewHolder(v : View) : RecyclerView.ViewHolder(v){
    var imageView : ImageView = v.findViewById(R.id.iv_custom)
    var textView : TextView = v.findViewById(R.id.tv_custom)

    val profile = imageView
    val name = textView

}

class CustomAdapter(val DataList:ArrayList<Data>) : RecyclerView.Adapter<CustomViewHolder>(){

    // 생성하는 부분
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.custom_list, parent, false)
        return CustomViewHolder(itemView)
    }

    // 수정 하는 부분
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.profile.setImageResource(DataList[position].profile)
        holder.name.text = DataList[position].name
    }

    override fun getItemCount(): Int {
        return DataList.size
    }

}