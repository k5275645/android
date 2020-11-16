package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practice_15)

        Log.d("life_cycle", "onCreate")
    }

    override fun onStart() {
        Log.d("life_cycle", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("life_cycle", "onDestroy")
        super.onDestroy()
    }
}