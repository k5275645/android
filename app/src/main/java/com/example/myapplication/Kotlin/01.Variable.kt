package com.example.myapplication.Kotlin

// 01. Variable 변수
// ->상자

// 변수 선언 방법
// var/val 변수명(상자) = 값(넣고 싶은 것)
// Variable/Value
// Variable : 내 마음대로 원하는 것을 넣을 수 있는 상자
// Value : 한번 넣으면 바꿀 수 없는 상자

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "goodbye"
    point = 10.4
    //fix = 100 -> 불가

    println(num)
    println(hello)
    println(point)
}