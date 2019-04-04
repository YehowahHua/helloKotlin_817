package com.yehowah.hellokotlin_817

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent //其实是getIntent
        val data  = intent.getStringExtra("data")
        Log.e("SecondActivity",data)

    }
}
