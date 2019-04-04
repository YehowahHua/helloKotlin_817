package com.yehowah.hellokotlin_817

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //用as表示类型转换
        val secondActBt = findViewById(R.id.secondAct_Bt) as Button
        secondActBt.setOnClickListener {
            val secondIntent = Intent(this@MainActivity,SecondActivity::class.java)
            secondIntent.putExtra("data","data from mainActivity")
            startActivity(secondIntent)
        }//简写了View.OnClickListener{}
    }

















}
