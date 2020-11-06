package com.example.myapplication.Kotlin

// 08. 제어 흐름
// - if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if/else 사용 방법
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 크지않다")
    }

    //
    if (a > b) {
        println("a가 b보다 크다")
    }

    //
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 크지않다")
    } else if (a == b) {
        println("a와 b가 같다")
    }

    //값을 리턴하는 if 사용법
    val max = if(a>b){
        a // 5
    }else {
        b // 10
    }

    val max2 = if(a > b) a else b
    println()
    println(max)
    println(max2)
}



