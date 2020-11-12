package Kotlin

fun main(array: Array<String>){
    //val night : Night = Night()
    val superNight : SuperNight = SuperNight()
    //night.attack()
    superNight.attack()

}

open class Night(){
    open fun attack(){
        println("공격을 했다!")
    }
    fun defence(){
        println("수비를 했다!")
    }
    fun heal(){
        println("hp가 올랐다!")
    }

    open fun superAttack() {}
}
class SuperNight() : Night(){
    override fun attack() = super.attack()
}


class Monster(healthPoint: Int){
    fun attack(){

    }
    fun defence(){

    }
}