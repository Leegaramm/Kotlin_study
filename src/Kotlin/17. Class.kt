package Kotlin

// 18 class
// 객체란 무엇인가? -> 이름이 있는 모든

// 절차지향 프로그래밍은 위에서부터 아래로 코드를 실행시킴으로써 문제가 해결된다
// 객체지향 프로그래밍은
// - 객체를 만든 후 객체에게 일을 시켜서 문제를 해결한다
// 축구게임 - 선수, 심판, 감독, 경기장, 관중 각각의 객체를 만든다

// 객체를 만들 때
// - 설명서가 있어야 한다

fun main(array: Array<String>){
    // 클래스(설명서)를 이용하여 실체를 만드는 방법
    // -> 인스턴스화한다. 인스턴스를 만든다.
    Car("v8 engine","big") // 차가 실제로 만들어진 것과 같다.
    // 우리가 만든 설명서(car)는 자료형이 되기도 한다.
    val bigCar: Car =  Car("v8 engine","big")
    val superCar : superCar = superCar("good engine","good body","good door")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runnableCar : RunnableCar = RunnableCar("simple engine","good body")
    // RunnableCar.drive()는 안된다 -> RunnableCar는 설명서에 불과하다. 인스턴스화되지 않았다.
    runnableCar.drive()
    runnableCar.ride()
    runnableCar.navi("seoul")

    // 인스턴스의 멤버 변수에 접근하는 방법
    val runnableCar2 : RunnableCar2 = RunnableCar2("good","good")
    println(runnableCar2.body)
    println(runnableCar2.engine)
}

// 객체(설명서) 만드는 방법(1)
class Car(var engine: String,var body: String){

}// car를 만드는 설명서, 차를 만들기 위해서 엔진과 바디가 필요하다


// 객체(설명서) 만드는 방법(2)
class superCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine //this.engine은 상단에 선언한 엔진(핑크색)을 의미한다
        this.body = body
        this.door = door
        // main함수에 선언한 superCar클래스에서 받은 인자인 "good engine","good body","good door"가 constructor로 오게 되고
        // 그것이 다시 위에 있는 (부품설명서)에 저장되는 것 - 그것을 나타내는 것이 this.engine = engine
    }

}
    // 클래스 만드는 방법(3) -> 1번 방법의 확장
    class Car1 constructor(engine: String, body: String){ // 첫번째 설명서 -> 부품이 두 개 있을 때
         var door:String = ""
        //생성
        constructor(engine: String,body: String,door: String) : this(engine,body){ // 두번째 설명서 -> 부품이 세 개 있을 때
            this.door = door
        }
    }

    // 클래스 만드는 방법(4) -> 2번 방법의 확장
    class Car2 {
        var engine: String = ""
        var body: String = ""
        var door: String = ""

        constructor(engine: String, body: String) {
            this.engine = engine
            this.body = body
        }

        constructor(engine: String, body: String, door: String) {
            this.engine = engine
            this.body = body
            this.door = door
        }
    }
        class RunnableCar(engine: String,body: String){

            fun ride(){
                println("탑승하였습니다")
            }
            fun drive(){
                println("달립니다")
            }
            fun navi(destination:String){
                println("$destination 으로 목적지가 설정되었습니다")
            }
        }

        class RunnableCar2{
            var engine:String
            var body:String

            constructor(engine: String,body: String){
                this.engine = engine
                this.body = body
            }

            init{
                // 초기세팅을 할 때 유용하다.
                println("RunnableCar2가 만들어졌습니다")
            }

            fun ride(){
                println("탑승하였습니다")
            }
            fun drive(){
                println("달립니다")
            }
            fun navi(destination:String){
                println("$destination 으로 목적지가 설정되었습니다")
            }

        }
        //오버로딩 -> 함수명이 같은 두 개의 함수를 한 클래스에서 사용(이름이 같지만 받는 파라미터가 다른 함수)
        class Test{
            fun test(a:Int){
                println("up")
            }
            fun test(a:Int,b:Int){
                println("down")
            }
        }


