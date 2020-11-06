package com.example.myapplication.Kotlin

//02.자료형
//정수형 : Long > Int > Short > Byte
//실수형 : Double > Float
//문자 : Char
//문자열 : String
//논리형(참True/거짓False) : Boolean

// 변수 선언 방법(1)
// var/val 변수명(상자) = 값(넣고 싶은 것)
// Variable/Value
// Variable : 내 마음대로 원하는 것을 넣을 수 있는 상자
// Value : 한번 넣으면 바꿀 수 없는 상자

// 변수 선언 방법(2)
// var/val 변수 : 자료형 = 값

var number = 10
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

// Variable or Value??
// - 1. 변하지 않는 값이라면 -> Value
// - 2. 변하는 값이라면 -> Value

fun main(array: Array<String>){
    number = 20
    //number = 20.5 -> 오류

}

