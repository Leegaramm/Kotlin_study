package Kotlin

fun main(array :Array<String>){
    val a = mutableListOf<Int>(1,2,3)
    a.add(3,4)
    println(a) // {1, 2, 3, 4}
    a.add(5)
    println(a) // {1, 2, 3, 4, 5}
    a.add(0,100)
    println(a) // 0 index에 있는 값을 바꾸는 것이 아니라 0에 새로운 값을 넣어 다른 들을 뒤로 민다 {100, 1, 2, 3, 4, 5}
    a.set(0,200)
    println(a) // {200, 1, 2, 3, 4, 5}
    a.removeAt(0)
    println(a)

    val b = mutableSetOf<Int>(1,2,3,3)
    b.add(2)
    println()
    println(b) // 2는 이미 있는 값이므로 추가되지 않는다
    b.remove(2)
    println(b) // {1, 3}
    b.remove(100)
    println(b) // {1, 3}

    val c = mutableMapOf<String,Int>("one" to 1)
        println()
        c.put("two",2)
        println(c)
        c.replace("two",3)
        println(c)
        println(c.keys)
        println(c.values)


}



