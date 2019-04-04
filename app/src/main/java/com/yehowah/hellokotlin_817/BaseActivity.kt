package com.yehowah.hellokotlin_817

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*

open class BaseActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityStack.add(this)
    }

    fun finishActivity(simpleName : String){
        for (activity in activityStack){
            if (activity.javaClass.getSimpleName() == simpleName){
                activity.finish()
                activityStack.remove(activity)
                break
            }
        }
    }
    //静态
    companion object {
        val activityStack = Stack<Activity>()

        fun put(a : Activity){
            activityStack.add(a)
        }

        fun finishAll(){
            while (!activityStack.empty()){
                activityStack.pop().finish()
            }
        }
    }












}