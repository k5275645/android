package com.example.myapplication.Kotlin

// 2) 은행 계좌 만들기
//    - 계좌 생성 기능 (이름, 생년 월일, 초기금액)
//    - 잔고를 확인 하는 기능
//    - 출금 기능
//    - 예금 기능
fun main(args: Array<String>) {
    val bank:Bank = Bank("김낙지", 910326, 1000)
    bank.balanceChk()
    bank.deposit(1000)
    bank.withdrawal(5000)
    bank.withdrawal(1000)
}

class Bank {
    var name: String
    var birth: Int
    var initialAmount: Int

    constructor(name: String, birth: Int, initialAmount: Int) {
        this.name = name
        this.birth = birth
        this.initialAmount = initialAmount
    }

    fun balanceChk() {
        println("잔액은 $initialAmount 원 입니다")
    }

    fun deposit(amount: Int) {
        println("예금 합니다 현재 잔액 $initialAmount 원")
        initialAmount = initialAmount + amount
        println("예금 후 잔액 : $initialAmount")
    }

    fun withdrawal(amount: Int) {
        println("출금 합니다 현재 잔액 $initialAmount 원")
        if (initialAmount > amount) {
            println("출금하려는 금액 : $amount 원")
            initialAmount = initialAmount - amount
            println("출금 후 잔액 : $initialAmount")
        } else {
            println("출금하려는 금액 $amount")
            println("잔액이 부족합니다")
        }
    }
}