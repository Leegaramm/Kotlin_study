package Kotlin

fun main(args: Array<String>){

    var array = arrayOf(1,2,3)

    // 배열을 만드는 방법(3)
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('a','b','c') // char -> '', string -> ""

    // 배열을 만드는 방법(4) -> lambda를 활용한 방법
    var a5 = Array(10,{ 0 })
    var a6 = Array(5,{1;2;3;4;5;})
}