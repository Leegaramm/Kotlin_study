package Kotlin


// 20. 상속
// 부모로부터 설명서를 물려받는다

fun main(array: Array<String>){
    val superBike : SuperBike = SuperBike()
    superBike.drive()
    println(superBike.stop())
}
// 부모: Bike
// 자식: SuperBike
open class Bike(){
    fun drive(){

    }
    open fun stop() : String{
        return "멈춘다"
    }
}

class SuperBike() : Bike(){
    override fun stop(): String {
        val brake = super.stop()
        // superBike의 stop함수를 호출하면 부모의 stop을 호출하겠다 ->super.stop   덮어쓰는 것 -> override
        return "빨리 $brake"
    }
}

class Truck(engine: String, body: String){

}

class Bus(engine: String, body: String){

}