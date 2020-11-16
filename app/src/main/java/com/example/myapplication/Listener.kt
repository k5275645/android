package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        // View를 activity로 가져오는 방법
        // 1> 직접 찾아서 가져온다
        //val textView : TextView = findViewById(R.id.hello)
        // 2> xml을 import해서 가져온다
        //hello.

        // 익명함수
        // 1 -> 람다방식(익명함수를 간단하게 사용하기 위한 방법)
        hello.setOnClickListener{
            Log.d("click", "Click!")
        }

        // 2 -> 익명함수 방식
        hello.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Click!")
            }
        })

        // 3 -> 이름이 필요한 경우
        val click = object: View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Click!")
                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.cat)
                number += 10
                Log.d("number", ""+number)
            }
        }
        hello.setOnClickListener(click)

        // View를 조작하는 함수들
        // 1> setText
        // 2> setImageResource

    }
}