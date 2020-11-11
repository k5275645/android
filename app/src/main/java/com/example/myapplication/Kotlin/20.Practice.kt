package com.example.myapplication.Kotlin

// 2) 은행 계좌 만들기
//    - 계좌 생성 기능 (이름, 생년 월일, 초기금액)
//    - 잔고를 확인 하는 기능
//    - 출금 기능
//    - 예금 기능
fun main(args: Array<String>) {
    val bank: Bank = Bank("김낙지", 910326, 1000)
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

/* 강사 풀이
* fun main(array: Array<String>) {
    val account: Account = Account("홍길동", "1990/3/1", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 = Account("홍길동", "1990/3/1", -2000)
    println(account2.checkBalance())

    println()
    val account3 = Account2("홍길동", "1990/3/1")
    val account4 = Account2("홍길동", "1990/3/1", 4000)
    println(account3.checkBalance())
    println(account4.checkBalance())


}
// 2) 은행 계좌 만들기
//    - 계좌 생성 기능 (이름, 생년 월일, 초기금액)
//    - 잔고를 확인 하는 기능
//    - 출금 기능
//    - 예금 기능

class Account {

    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) this.balance = balance else this.balance = 0
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(val name: String, val birth: String, var balance: Int = 1000) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance: Int) {

    val balance: Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance(): Int {
        return balance
    }

}
* */