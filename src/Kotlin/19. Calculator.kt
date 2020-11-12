package Kotlin

fun main(array: Array<String>){
    val calculator : Calculator = Calculator(0,0)
    calculator.sum(10,5)
    calculator.minus(10,5)
    calculator.multi(10,5)
    calculator.devide(10,5)
}

class Calculator{
    var number1:Int = 0
    var number2:Int = 0

    constructor(number1:Int,number2:Int){
        this.number1 = number1
        this.number2 = number2
    }

    fun sum(number1: Int, number2: Int){
        println(number1 + number2)
    }

    fun minus(number1: Int, number2: Int){
        println(number1 - number2)
    }

    fun multi(number1: Int, number2: Int){
        println(number1 * number2)
    }

    fun devide(number1: Int,number2: Int){
        println(number1 / number2)
    }

}