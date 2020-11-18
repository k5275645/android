package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    // Fragment에게 값을 받기 위한 작업?
    override fun onDataPass(data: String?) {
        Log.d("pass", ""+data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")

        val fragmentOne : FragmentOne = FragmentOne()

        // 프라그먼트에 data를 넣어주는 방법
        val bundle:Bundle = Bundle()
        bundle.putString("hello", "hellovalue")
        fragmentOne.arguments = bundle

        button.setOnClickListener {
            // 프라그먼트를 동적으로 작동하는 방법
            // 프라그먼트 붙이는 방법 replace / add
            val fragmentManager:FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne);
            fragmentTransaction.commit()
            // 끝을 내는 방법 ( 둘이 유사함, 요새는 핸드폰이 좋아서)
            // commit()     -> 시간 될 때 해 (좀 더 안정적)
            // commitnow()  -> 지금 당장 해
        }

        button2.setOnClickListener {
            // 프라그먼트 remove / detach 방법
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }
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