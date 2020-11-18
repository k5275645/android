package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    //var lateNumber: Car -> 오류(선언x)
    lateinit var lateNumber: Car

    class Car(var number:Int){}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        // lateinit -> 사용하기 전에 초기화 해줘야함
//        Log.d("number", "lateCar : " + lateCar) //com.example.myapplication.NullSafety$Car@28c93b2
//        Log.d("number", "lateCar : " + lateCar.number) // 100
//        val lateCar = Car(100)

        val lateCar = Car(100)
        Log.d("number", "lateCar : " + lateCar) //com.example.myapplication.NullSafety$Car@28c93b2
        Log.d("number", "lateCar : " + lateCar.number) // 100

        //
        val number: Int = 10
        val number1: Int? = null

        // val number5: Int = number1 + 10
        // !! -> 개발자가 해당 변수가 null이 아님을 보장하는 것. 실제로는 null일 수 있음. 사용 비추
        //val number5: Int = number1!! + 10

        //val number3 = number1? + number
        val number3 = number1?.plus(number)
        Log.d("number", "number3 : " + number3) // null

        // 삼항연산자 -> 엘비스 연산자(?:)
        // NullSafety
        val number4 = number1 ?: 10
        Log.d("number", "number4 : " + number4) // 10

    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a:Int, b:Int?):Int? {
        return b?.plus(a)
    }
}