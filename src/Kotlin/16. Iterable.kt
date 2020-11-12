package Kotlin

// 16 iterable

fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법(1)
    /*
    for(item in a) {
        println(item)
        }
     */
    for (item in a) {
        if (item == 5) println("five")
        else println("just number")
    }
    println()
    //반복하는 방법(2), 인덱스값과 아이템값을 둘 다 알고싶을 때
    for ((index, item) in a.withIndex()) println("Index " + index + " item " + item)
    println()

    //반복하는 방법(3), 람다를 이용한 반복문
    a.forEach {
        println(it)
    }

    //반복하는 방법(4), 변수명을 바꾸고 싶을 때
    a.forEach { item ->
        println(item)
    }
    println()
    //반복하는 방법(5), (2)와 똑같은 결과
    a.forEachIndexed { index, item ->
        println("Index " + index + " item " + item)
    }
    println()

    // 반복하는 방법(6)
    for (i in 0 until 9) {

        println(a.get(i))
    }
    println()

    // 반복하는 방법(7)
    for (j in 0 until 9 step (2)) {
        println(a.get(j))
    }
    println()

    // 반복하는 방법(8)
    for(ii in a.size -1 downTo(0)){
        // index 8부터 0까지 반대로 반복
        println(a.get(ii))
    }

    // 반복하는 방법(9)
    for(i in a.size -1 downTo(0) step(2)){
        println(a.get(i))
    }

    // 빈복하는 방법(10)
    for(i in 0..10){
        println(i)
    }
    println()

    // 반복하는 방법(11)
    var b:Int = 5
    var c:Int = 10

    while(b<c){
        b++
        println(b)
    }
}