package com.example.myapplication.Kotlin

// 22. Variable_range

var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.name
    test.testFun()
    println(number100)
}

class Test(var name: String){
    fun testFun(){
        var birth:String = "2000/03/01"
        name = "홍길동"
        number100 = 100
        //gender 사용 불가
        fun testFun2(){
            var gender:String = "남자"
        }
    }

    fun testFun2(){
        // testFun의 birth는 사용불가
    }
}