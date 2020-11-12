package com.example.myapplication.Kotlin

import java.util.*

// 자바코드를 코틀린에 넣으면 자동으로 변환해줌(오류가 없다면)
object HelloWorld {
    @JvmStatic
    fun main(args: Array<String>) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        // nextInt() reads the next integer from the keyboard
        val number = reader.nextInt()

        // println() prints the following line to the output screen
        println("You entered: $number")
    }
}