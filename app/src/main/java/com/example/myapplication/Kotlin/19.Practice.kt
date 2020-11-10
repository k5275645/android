package com.example.myapplication.Kotlin

// 1) 사칙 연산을 수행할 수 있는 클래스
fun main(args: Array<String>) {
    val cal:Cal = Cal()
    println(cal.plus(1,2))
    println(cal.minus(3,4))
    println(cal.multiplication(3,4))
    println(cal.division(10,3))

}

class Cal{
    fun plus(a:Int, b:Int):Int{
        return a + b
    }

    fun minus(a:Int, b:Int):Int{
        return a - b
    }

    fun multiplication(a:Int, b:Int):Int{
        return a * b
    }

    fun division(a: Int, b: Int):Int{
        return a / b
    }
}