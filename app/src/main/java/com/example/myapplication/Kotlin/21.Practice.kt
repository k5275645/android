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

/* 강사 풀이
* fun main(args: Array<String>) {
    val tv = TV(listOf<String>("K", "M", "S"))

    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.currentChannelNumber


}

class TV(val channels: List<String>) {

    var onOrOff: Boolean = false // True -> On , False -> Off
    var currentChannelNumber = 0
        set(value) {
            // currentChannelNumber = value -> 무한루프, currentChannelNumber를 할당할 때 계속 호출됨, 해결방법 field
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
        get() {
            println("호출되었습니다")
            return field + 1
        }
    // 값의 할당
    // a = b


    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber = currentChannelNumber + 1
//        channels.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber = currentChannelNumber + 1
//                return
//            }
//        }
    }

    fun channelDown() {
        currentChannelNumber = currentChannelNumber - 1
//        channels.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber = currentChannelNumber - 1
//                return
//            }
//        }
    }

}
* */