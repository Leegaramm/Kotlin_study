package Kotlin

fun main(array: Array<String>){
    val make : Make = Make("이가람",930215)
    make.print()
    val money : Money = Money(10000)
    money.input(2000)
    money.output(4000)
    println()
    println(money.totalMoney)
    money.view()

}

class Make {
    var name: String = ""
    var birthday: Int = 0

    constructor(name: String, birthday: Int) {
        this.name = name
        this.birthday = birthday
    }

    init {
        println("계좌가 생성되었습니다.")
    }

    fun print() {
        println("이름 : $name")
        println("생년월일 : $birthday")
    }
}
    class Money {
        var money: Int = 0
        var newMoney: Int = 0
        var lossMoney: Int = 0
        var totalMoney: Int = 0

        constructor(money: Int) {
            this.money = money
        }

        fun input(newMoney: Int) {
            var newMoneyResult = money + newMoney
            println("잔액은 $newMoneyResult 입니다.")
            totalMoney = newMoneyResult
        }

        fun output(lossMoney: Int) {
            var lossMoneyResult = totalMoney - lossMoney
            println("잔액은 $lossMoneyResult 입니다.")
            totalMoney = lossMoneyResult
        }

        fun view() {
            println("잔고는 $totalMoney 입니다")
        }
    }
