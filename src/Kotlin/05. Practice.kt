package Kotlin

fun plusThree(num1:Int,num2:Int,num3:Int):Int{
    return num1+num2+num3
}

fun minusThree(num1:Int,num2:Int,num3:Int):Int = num1-num2-num3

// 내부함수
// 함수 안의 함수

fun showMyPlus(num1:Int,num2:Int): Int {
    println(num1)
    println(num2)

    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    return plus(num1, num2)
}


fun main(array:Array<String>){
    val plusResult : Int = plusThree(1,2,3)
    println(plusResult)
    val minusResult : Int = minusThree(3,2,1)
    println(minusResult)
    val showShowMyPlus : Int = showMyPlus(1,2)
    println(showShowMyPlus)
}