package Kotlin

fun main(array: Array<String>){

    // 산술 연산자
   val sum = 10+1
    val minus = 10-1
    val multi  = 10*2
    val devide = 10/2
    val na = 10%3

    println(sum)
    println(minus)
    println(multi)
    println(devide)
    println(na)

    // 대입 연산자
    val f = 5
    // val 5 = f (x)

    // 복합 대입 연산자
    var a = 10
    a+= 10

    println(a)

    //증감 연산자
    a++
    println(a)
    a--
    println(a)

    //비교 연산자
    var g = a > na
        println(g)

}