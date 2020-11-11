package com.example.myapplication.Kotlin

// 1) 사칙 연산을 수행할 수 있는 클래스
fun main(args: Array<String>) {
    val cal:Cal = Cal()
    println(cal.plus(1,2))
    println(cal.minus(3,4))
    println(cal.multiplication(3,4))
    println(cal.division(10,3))
}

class Cal(){
    fun plus(a:Int, b:Int):Int{
        return a + b
    }

    fun minus(a:Int, b:Int):Int{
        return a - b
    }

    fun multiplication(a:Int, b:Int):Int{
        return a * b
    }

    fun division(a: Int, b: Int):Int{
        return a / b
    }
}

/* 강사풀이
*fun main(array: Array<String>) {
    val calculator1 = Calculator1()
    println(calculator1.plus(4, 5))
    println(calculator1.minus(4, 5))
    println(calculator1.mutiply(4, 5))
    println(calculator1.divide(4, 5))

//    calculator1.plus(3,4).plus(4,5)
    //-----------/Calculator1
    //--------------------/7
    //----------------------/ 7.plus(4,5)

    println()

    val calculator2 = Calculator2()
    println(calculator2.plus(1, 2, 3, 4, 5))
    println(calculator2.minus(10, 1, 2, 3))
    println(calculator2.multiply(1, 2, 3))
    println(calculator2.divide(10, 2, 3))

    println()

    val calculator3 = Calculator3(3)
    calculator3.plus(5).minus(5)
    //---------/Calculator3(3)
    //---------------/Calculator3(8)
    //------------------/Calculator3(8).minus(5)
    // -> Chaining(체이닝)


}


// 가장 쉬운 방법
class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        return a - b
    }

    fun mutiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺸다
        // 리턴은 몫만 한다
        return a / b
    }
}


class Calculator2() {
    fun plus(vararg numbers: Int): Int { //1,2,3,
        var result: Int = 0
        numbers.forEach {
            result = result + it
            // result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {//10, 1, 2, 3
        // 10 - 1 - 2 - 3
        // 0 - 10 - 1 -2 -3
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if (i != 0) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {// 10, 2, 3 -> 10/2/3
        var result: Int = numbers[0] //10
        numbers.forEachIndexed { index, value ->
            //10 -> 10/10/2/3
            if (index != 0) {
                if (value != 0) {
                    result = result / value
                }
            }
        }
        return result
    }

}

class Calculator3(val initialValue: Int) {

    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}
*
*
*
*
*
*
* */

