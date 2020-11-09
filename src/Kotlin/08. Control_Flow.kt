package Kotlin

//08. 제어흐름

fun main(array: Array<String>){
    val a = 5
    val b = 10
    // 1

    if(a > b) println("a가 b보다 크다")/* 2 */ else println("b가 a보다 크다") /* 3 */
    //4

    // 실행순서 : 1 -> a>b면 2 / 아니면 3 -> 4

    if(a>b){

    } else if(a<b) {

    } else {
    }

    if(a>b) println("rr") else if(a<b) println("ff") else println("tt")

    val max = if(a>b){
        a
    } else {
        b
    }
    println()
    println(max) // 결과가 10

}