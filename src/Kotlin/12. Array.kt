package Kotlin

// 12 배열
// 베열이 필요한 이유
// 어떤 그룹이 필요할
fun main(args:Array<String>){
    // 배열을 생성하는 방법(1)
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    // 배열을 생성하는 방법(2)
    var group2 = arrayOf(1,2.5,4,6,"hello")

    /*
    Index란
    -> 순서(번째)
    [1, 2, 3, 4, 5]
    0부터 시작
    Index0 -> 1, Index1 -> 2
    */

    // 배열의 값을 꺼내는 방법(1)
    val index = group1.get(0)
    println(index)

    // 배열의 값을 꺼내는 방법(2)
    val index2 = group1[0]
    println(index2)

    // 배열의 값을 바꾸는 방법(1)
    group1.set(
            0,
            100
    )
    println(group1[0])

    group1[0] = 200
    println(group1[0])

}