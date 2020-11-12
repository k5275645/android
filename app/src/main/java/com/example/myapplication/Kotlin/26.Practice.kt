package com.example.myapplication.Kotlin

// 과제
// Charactor (부모)
// SuperNight, SuperMonster (자식)

fun main(args: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)
}

//상속이 만들어낸 개념
// - 자식 클래스는 부모 클래스의 타입니다.
// - 부모 클래스는 자식 클래스의 타입이 아니다!

open class Charator(var hp:Int, val power:Int){
    fun attack(charator:Charator, power:Int = this.power){
        charator.defence(power)
    }
    open fun defence(damage:Int){
        hp -= damage
        if(hp > 0){
            println("${javaClass.simpleName} 남은체력 $hp")
        }else println("사망했습니다.")
    }
}

// 자식클래스가 인스턴스화 되려면, 부모 클래스가 인스턴스화가 선행 되어야 한다.
// 부모생성자에 넘어가는 애들은 var, val를 적지 않아야 한다.(부모한테 이미 선언됨)
class SuperNight(hp:Int, power:Int):Charator(hp, power){
    val depensePower = 2
    override fun defence(damage: Int) {
        super.defence(damage - depensePower)
    }
}

class SuperMonster(hp:Int, power:Int):Charator(hp, power){
    fun bite(charator: Charator){
        super.attack(charator, power + 2)
    }
}