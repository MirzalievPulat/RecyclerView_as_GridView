package com.example.recyclerview_as_gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_as_gridview.adapter.RecyclerAdapter
import com.example.recyclerview_as_gridview.model.Member

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,3)

        refreshAdapter(prepareMembers())
    }
    fun refreshAdapter(members:ArrayList<Member>){
        var adapter = RecyclerAdapter(members)
        recyclerView.adapter = adapter
    }

    fun prepareMembers():ArrayList<Member>{
        var members = ArrayList<Member>()
        for (i in 0..20){
            members.add(Member("Mirzaliyev", "Po'lat" ))
        }
        return members
    }
}