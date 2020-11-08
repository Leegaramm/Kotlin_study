package Kotlin

var a = 1+2+3+4+5 // 연산의 결과값을 변수에 넣어 줄 수 있다
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - 존재하지 않는다
// 휴지를 다 쓰고 심만 남은 상태는 Null이 아니라 0이다
// null은 휴지심도 없는 상태를 말한다

//var abc:Int = null -> 오류(int가 null을 가질 수 없음

var abc1:Int? = null //int에 ?를 붙여줌으로써 null을 가질 수 있게 된다
var abc2:Double? = null


fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
}