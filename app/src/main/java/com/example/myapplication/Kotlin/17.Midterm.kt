package com.example.myapplication.Kotlin

// 1번 문제
// List를 두개 만든다
// 첫번째 List에는 0 부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한후
// 짝수면 True 홀수면 False를 넣어 준다
fun main(args: Array<String>) {
    firstQ()
    secondQ(60)
    thirdQ(67)
    gugudan()
}

fun firstQ(){
    var firstList = mutableListOf<Int>()
    var secondList = mutableListOf<Boolean>()
    for(i in 1..9){
        firstList.add(i)
        secondList.add(oddChk(i))
    }
    println(firstList)
    println(secondList)
}

fun oddChk(firstItem: Int):Boolean{
    var a:Boolean
    if(firstItem % 2 == 0){
        a = true
        return a
    }else {
        a = false
        return a
    }
}

// 2번 문제
// 학점을 구하자
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F
fun secondQ(score : Int):String{
    var a:String = when(score){
        in 80..90 -> "A"
        in 70..79 -> "B"
        in 60..69 -> "C"
        else -> "F"
    }
    println(a)
    return a
}

// 3번 문제
// 전달 받은 숫자의 각 자리 숫의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다
fun thirdQ(a: Int){
    var b:String = a.toString()
    println(b.substring(0,1).toInt() + b.substring(1,2).toInt())
}

// 4번 문제
// 구구단을 출력하자
fun gugudan(){
    for (i in 2..9){
        for(j in 1..9){
            println("" + i + " * " + j + " = " + i * j)
        }
    }
}
