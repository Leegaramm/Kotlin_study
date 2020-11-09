package Kotlin

fun main(array: Array<String>){
    var a : Int? = null
    var b : Int = 10
    var c : Int = 100

    if(a == null) println("a는 null입니다.") else println("a는 null이 아닙니다")
    if(b + c == 110) println("110입니다") else println("110이 아닙니다")

    //엘비스 연산자
    val number : Int? = null
    val number2 = number ?: 10
    println(number2)

}