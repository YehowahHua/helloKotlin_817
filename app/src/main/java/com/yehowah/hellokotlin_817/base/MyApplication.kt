package com.yehowah.hellokotlin_817.base

import android.app.Application

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
//        val help =
    }
    companion object {
        lateinit var INSTANCE:MyApplication
        var ENCRYPTED = true
    }
}