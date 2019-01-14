package com.example.tnguy.quizlit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.tnguy.quizlit.Adapter.CategoryAdapter
import com.example.tnguy.quizlit.Common.SpacesItemDecoration
import com.example.tnguy.quizlit.DBHelper.DBHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    //this is actually the starting screen haha
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title = "Quizlet"
        setSupportActionBar(toolbar)

        recycler_category.setHasFixedSize(true)
        recycler_category.layoutManager = GridLayoutManager(this, 2)

        val adapter = CategoryAdapter(this, DBHelper.getInstance(this).allCategories)
        recycler_category.addItemDecoration(SpacesItemDecoration(4))
        recycler_category.adapter = adapter


    }
}
