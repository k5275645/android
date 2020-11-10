package com.example.myapplication.Kotlin

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)

fun main(args: Array<String>) {
    var tv:TV = TV()
    tv.off()
    tv.on()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalUp()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalUp()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalUp()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalUp()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalDown()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalDown()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalDown()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalDown()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")
    tv.ChannalDown()
    println("현재채널 : ${tv.channel} ")
    println("현재채널 : ${tv.channelChk()}")

}

class TV {
    var channel:Int = 0
    var channelList = arrayListOf<String>("S사","M사","K사")

    fun on() {
        println("TV를 켭니다.")
    }

    fun off() {
        println("TV를 끕니다.")
    }

    fun channelChk():String{
        return channelList[channel]
    }

    fun ChannalUp() {
        println("채널을 올립니다.")
        channel = channel + 1
        if(channel > 2){
            channel = 0
        }
    }

    fun ChannalDown() {
        println("채널을 내립니다.")
        channel = channel - 1
        if(channel < 0){
            channel = 2
        }
    }
}