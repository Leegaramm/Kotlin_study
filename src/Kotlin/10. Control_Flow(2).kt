package Kotlin

// 10 제어흐름

// when

fun main(args:Array<String>){
    val value : Int = 3
    when(value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("nothing")
    }
}