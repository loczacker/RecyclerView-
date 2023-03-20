package com.rikkei.training.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
//RecycleView LinearLayoutManager
//    private var layoutManager: RecyclerView.LayoutManager?= null
//    private var adapter: RecyclerView.Adapter<RecycleAdapter.ViewHolder>?= null

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //LinearLayoutManager
//        layoutManager = LinearLayoutManager(this)
//
//        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//
//        recyclerView.layoutManager = layoutManager
//
//        adapter = RecycleAdapter()
//        recyclerView.adapter = adapter


        //GridLayoutManager
//        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
//        photoAdapter = PhotoAdapter(applicationContext)
//        recyclerView.adapter = photoAdapter
//
//        dataList.add(DataModel("Title", "Desc", R.drawable.three))
//        dataList.add(DataModel("Title", "Desc", R.drawable.four))
//        dataList.add(DataModel("Title", "Desc", R.drawable.five))
//        dataList.add(DataModel("Title", "Desc", R.drawable.six))
//        dataList.add(DataModel("Title", "Desc", R.drawable.jason))
//        dataList.add(DataModel("Title", "Desc", R.drawable.max))
//        dataList.add(DataModel("Title", "Desc", R.drawable.filip))
//        dataList.add(DataModel("Title", "Desc", R.drawable.fernando))
//
//        photoAdapter.setDataList(dataList)


        //StaggeredGridManager
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", "Desc", R.drawable.three))
        dataList.add(DataModel("Title", "Desc", R.drawable.four))
        dataList.add(DataModel("Title", "Desc", R.drawable.five))
        dataList.add(DataModel("Title", "Desc", R.drawable.six))
        dataList.add(DataModel("Title", "Desc", R.drawable.jason))
        dataList.add(DataModel("Title", "Desc", R.drawable.max))
        dataList.add(DataModel("Title", "Desc", R.drawable.filip))
        dataList.add(DataModel("Title", "Desc", R.drawable.fernando))
        dataList.add(DataModel("Title", "Desc", R.drawable.three))
        dataList.add(DataModel("Title", "Desc", R.drawable.four))
        dataList.add(DataModel("Title", "Desc", R.drawable.five))
        dataList.add(DataModel("Title", "Desc", R.drawable.six))
        dataList.add(DataModel("Title", "Desc", R.drawable.jason))
        dataList.add(DataModel("Title", "Desc", R.drawable.max))
        dataList.add(DataModel("Title", "Desc", R.drawable.filip))
        dataList.add(DataModel("Title", "Desc", R.drawable.fernando))

        photoAdapter.setDataList(dataList)

    }
}