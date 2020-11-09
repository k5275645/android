package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    val a = mutableListOf<Int>(1,2,3)
    println(a) // [1, 2, 3]
    a.add(4)
    println(a) // [1, 2, 3, 4]
    a.add(0, 100)
    println(a) // [100, 1, 2, 3, 4]
    a.set(0, 200)
    println(a) // [200, 1, 2, 3, 4]
    a.removeAt(1)
    println(a) // [200, 2, 3, 4]

    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    println(b) // [1, 2, 3, 4]
    b.add(2)
    println(b) // [1, 2, 3, 4] 중복허용X
    b.remove(2)
    println(b) // [1, 3, 4]
    b.remove(100)
    println(b) // [1, 3, 4] -> 없는 값을 제거하려고 해도 에러가 발생하는 것은 아니다.

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    println(c) // {one=1}
    c.put("two", 2)
    println(c) // {one=1, two=2}
    c.replace("two", 3) // syntex에러는 설정한 버전때문이니까 무시..?
    println(c) // {one=1, two=3}
    println(c.keys) // [one, two]
    println(c.values) // [1, 3]
    c.clear()
    println(c) // {}
}