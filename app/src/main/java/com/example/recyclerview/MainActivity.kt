package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    val DataList = arrayListOf(
        Data(R.drawable.item_layout_shape, "0"),
        Data(R.drawable.ic_launcher_background, "1"),
        Data(R.drawable.ic_launcher_foreground, "2"),
        Data(R.drawable.cat, "3"),
        Data(R.drawable.dog, "4"),
        Data(R.drawable.rabbit, "5"),
        Data(R.drawable.item_layout_shape, "6"),
        Data(R.drawable.item_layout_shape, "7"),
        Data(R.drawable.item_layout_shape, "8"),
        Data(R.drawable.item_layout_shape, "9"),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        recyclerView.adapter = CustomAdapter(DataList)

    }
}