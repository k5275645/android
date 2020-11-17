package com.example.myapplication.Kotlin

// 16. Iterable

fun main(args: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 (1)
    for (item in a) {
        println(item) // 1 ~ 9
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }

    // 반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // cf) 문자열 + Int(정수) = 문자열
        // cf) 문자열 + 아무거나 = 문자열
    }

    // 반복하는 방법 (3) lamda
    a.forEach{
        println(it)
    }

    // 반복하는 방법 (4) lamda
    println()
    a.forEach{item ->
        println(item)
    }

    println()
    // 반복하는 방법 (6) ((2)와 같지만 lamda사용)
    a.forEachIndexed{ index, item ->
        println("index : " + index + " value : " + item)
    }
    println()

    // 반복하는 방법 (6)
    println("a.size : " + a.size) // 9
    for (i in 0 until a.size){
        // until은 마지막을 포함하지 않는다
        // 0부터 8까지이다(a.size는 9이지만 until 사용시 포함X)
        println(a.get(i))
    }
    println()
    // 반복하는 방법 (7)
    for(i in 0 until a.size step (2)){
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)){
        // 8부터 0까지 반복
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step (2)){
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (10)
    for (i in 0..a.size){
        // ..은 마지막을 포함한다.(until은 마지막을 포함하지 않았음)
        println(i)
    }
    println()

    // 반복하는 방법 (11)
    var b:Int = 0 // -> 1 -> 2 -> 3 -> 4
    var c:Int = 4
    while(b<c){
        b++ // while문을 정지시키기 위한 코드
        println(b)
    }
    println()

    // 반복하는 방법 (12) -> 조건이 false여도 한번은 실행됨
    var d:Int = 0
    var e:Int = 4
    do{
        println("hello")
        d++
    }while (d < e)
}