package com.example.recyclerview

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.home.HomeAdapter
import com.example.recyclerview.home.itemmodel.AbsHomeItemModel
import com.example.recyclerview.home.itemmodel.ArrowHomeItemModel
import com.example.recyclerview.home.itemmodel.HeaderItemModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = home_recycler_view
        mAdapter = HomeAdapter(this)
        mRecyclerView.run {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = mAdapter
        }
        mAdapter.updateList(buildData())
    }

    private fun buildData():List<AbsHomeItemModel> {
        val models: ArrayList<AbsHomeItemModel> = ArrayList<AbsHomeItemModel>()
        models.add(HeaderItemModel())
        models.add(ArrowHomeItemModel())

        //add other data

        return models
    }

    companion object{
        fun startActivity(context: Context?) {
            if (context == null) {
                return
            }
            val intent = Intent(context, MainActivity::class.java).apply {
                if (context !is Activity) {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
            }
            context.startActivity(intent)
        }
    }
}