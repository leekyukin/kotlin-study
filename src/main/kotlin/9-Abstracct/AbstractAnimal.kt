package `9-Abstracct`

fun main() {

    var r = Rabbit()

    r.eat()
    r.sniff()
}

abstract class AbstractAnimal {
    abstract fun eat()

    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : AbstractAnimal() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}