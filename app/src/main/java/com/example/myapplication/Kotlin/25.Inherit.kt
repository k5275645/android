package com.example.myapplication.Kotlin

// 25. Inherit 상속
// 개발시 두번까지는 봐준다, 두번이 넘어가면 리펙토링해라

fun main(args: Array<String>) {
    val superCar100:SuperCar100 = SuperCar100()
    println(superCar100.drive())
    //superCar100.stop()

    //val bus100: Bus100 = Bus100()
    //bus100.drive()
}

// class를 선언할 때는 private이 기본이다. 적지 않아도 private상태임
// 외부에서 상속받으려며 open상태를 만들어야한다.

// 부모 : Car100
// 자식 : SuperCar100
open class Car100(){
    open fun drive():String{
        //println("달린다")
        return "달린다"
    }
    open fun stop(){
    }
}

class SuperCar100():Car100(){
    override fun drive():String {
        //println("빨리 달린다")
        val run = super.drive()
        return "빨리 $run"
    }

    override fun stop() {
        super.stop()
    }
}

class Bus100():Car100(){}
