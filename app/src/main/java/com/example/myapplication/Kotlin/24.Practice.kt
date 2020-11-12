package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val night = Night(20, 4)
    val monster = Monster(15,5)

    night.attack(monster)
    monster.attack(night)

    //night.hp = 100 -> private이기 때문에 접근 불가
    //night.heal() -> 위와 같음. 결국 아무나 조작할 수 없도록 하기 위해 private을 붙임
}

class Night(private var hp:Int, private var power:Int){
    fun attack(monster:Monster){
        monster.defence(power);
    }

    fun defense(damage:Int){
        hp -= damage
        if(hp > 0) {
            heal()
            println("기사의 현재 체력은 $hp 입니다")

        } else println("기사가 죽었습니다. ")
    }

    private fun heal(){
        hp += 3
    }
}

class Monster(private var hp:Int, private var power:Int){
    fun attack(night:Night){
        night.defense(power)
    }

    fun defence(damage:Int){
        hp -= damage
        if(hp > 0) println("몬스터의 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다. ")
    }
}

/*class Monster2(private var hp:Int, private val power:Int){
    private fun attack(){
        // 처음 습관을 들일 때 private와 val 조합으로 만들고 상황에 따라서 public인지 var인지 수정해서 쓸 것
    }
}*/

