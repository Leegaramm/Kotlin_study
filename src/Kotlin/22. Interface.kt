package Kotlin


// 22 interface
// 인터페이스는 약속이다. 생성자가 없다 -> 인스턴스화 할 수 없다 ->  설명서가 아니다
// 지침서다. -> 니가 이것을 구현하고 싶으면 반드시 아래 기능을 다 만들어(기능의 구체적인 내용이 같지 않아도 된다)
// 인터페이스도 구현이 있는 함수를 만들 수 있다
// 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 기능을 구현할 필요가 없다
// 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현하는 클래스에서 기능을 구현하여야 한다
interface person_ {
    fun eat()
    fun sleep()
}

class student() : person_{
    override fun eat(){

    }
    override fun sleep(){

    }
}