package com.example.myapplication.Kotlin

//연산의 결과값을 변수에 넣어 줄 수 있다.
var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - 존재하지 않는다

// var abc : Int = null -> 할당불가
var abc1 : Int? = null // 문자열 "null"을 의미하는 것X
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(abc2)
    println(g)
}