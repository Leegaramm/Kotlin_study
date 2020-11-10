package Kotlin

//14 collection
// -> list, set, map


fun main(args: Array<String>){
    // immutable collection
    // List
    val numberList = listOf<Int>(1,2,3,3,3)
    println(numberList) // {1,2,3,3,3}
    println(numberList.get(0))
    println(numberList[0])
    println()
    numberList.forEach{
        println(it)
    }


    // Set -> 중복을 허용하지 않는다
    // -> 순서가 없
    val numberSet = setOf<Int>(1,2,3,3,3,4)
    println()
    println(numberSet) // {1,2,3}
    numberSet.forEach{
        println(it)
    }

    // Map -> key, value 형식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    // mutable collection
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,3,3)
    mNumberSet.add(4) // set에는 index가 없다
    println()
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2) // Map은 add가 아니라 put을 사용한다
    println()
    println(mNumberMap)

}