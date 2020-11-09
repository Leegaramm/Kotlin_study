package Kotlin

// 11 제어흐름 실습

fun main(args: Array<String>){
    val value : Int? = null

    when(value) {
        null -> println("value is null")
        else -> println("value is not null")


    }
    val value2 : Boolean? = null

    when(value2){
        true -> println("is true")
        false -> println("is false")
        null -> println("nullll")

    }
    val value3 = when(value2){
        true -> 1
        false -> 2
        null -> 3
    }
    //when의 다양한 조건식(1)
    val value4 : Int = 10
    when(value4){
        is Int -> println("ddd") // value4가 int면 ddd를 출력한
        else -> println("sss")
    }
    //when의 다양한 조건식(2)
    val value5:Int = 87
    when(value5){
        in 70..80 -> println("1")
        in 80..90 -> println("2")
        else -> println("3")
    }
}