package com.example.myapplication.Kotlin

// 14. Collection
// -> list, set, map

// List

fun main(args: Array<String>) {

    // Immutable Collections(변경 불가능)
    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList) // [1, 2, 3, 3]
    println(numberList.get(0)) // 1
    println(numberList[0]) // 1

    // Set -> 중복을 허용하지 않는다, 순서가 없다(Index가 X)
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet) // [1, 2, 3]
    numberSet.forEach{
        println(it)
        // 1
        // 2
        // 3
    }

    // Map -> Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap) // {one=1, two=2}
    println()
    println(numberMap.get("one")) // 1
    println(numberMap.get("two")) // 2
    println(numberMap.get("three")) // null

    // Mutable Collection(변경가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList.get(3)) // 4

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet) // [1, 2, 3, 4, 10]

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap) // {one=1, two=2}

}


