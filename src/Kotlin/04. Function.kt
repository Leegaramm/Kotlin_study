package Kotlin

// -함수
//      - 어떤 input을 넣어주면 어떤 output나오는 것
//      - y = x+2

// - 함수를 선언하는 방법
// fun 함수명(변수명: 타입, 변수명: 타입 ....) : 반환형 {
//        함수내용
//        return 반환값
//  }


fun plus(first:Int,second:Int): Int{
    println(first)
    println(second)
    val result: Int = first + second
    println(result)

    return result
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    return first + second
}

// - 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int) : Unit {
    val result: Int = first + second
    println(result)
}
fun printPlus2(first: Int,second: Int) {

}
fun main(array: Array<String>) {
    // 함수를 호출하는 방법
    //val value:Int = plus(3,4) //커맨드+p 누르면 어떤 인자를 받는지 알 수 있음
    // 인수를 명시적으로 전달하는 방법
    val value2 = plus(first = 10, second = 100)
    //println(value)
    println(value2)

    //디폴트 값을 갖는 함수 호출하기
    println()
    val result4 = plusFive(5)
    println(result4)

    println()
    printPlus(10, 20)
}