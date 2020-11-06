package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    //엘비스 연산자
    val number:Int? = 100
    val number2 = number ?: 10 // number가 null이면 10이 들어감, null이 아니면 number가 들어감
    println()
    println(number2)

    // if로 리턴을 받으려면 예외가 있으면 안됨
    val num1:Int = 10
    val num2:Int = 20
    val max = if(num1>num2){
        num1 // 10
    }else if(num1 == num2){
        num2 // 20
    }else {
        100
    }


}

