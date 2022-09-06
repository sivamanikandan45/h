package com.example.helloworld

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Created...")
    }

    override fun onStart(){
        super.onStart()
        println("Started...")
    }

    override fun onResume() {
        super.onResume()
        println("Resumed...")
    }

    override fun onPause() {
        super.onPause()
        println("Paused...")
    }

    override fun onStop() {
        super.onStop()
        println("Stopped...")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Destroyed...")
    }

    fun onViewClicked(view: View) {
        println("View CLicked...!")
    }

}