package `8-Overriding`

fun main() {

    var t  = Tiger()

    t.eat()
}

open class OverrideAnimal {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : OverrideAnimal() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}