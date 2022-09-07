package `7-class`

fun main() {

    var a = Animal("돈(money)", 1, "개")
    var b = Dog("돈(money)", 1)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("여유", 1)

    c.meow()
}

// open : 상속 가능하게 열어줌
open class Animal (var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

// 1. 자식 클레스는 부모 클레스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없다.
// 2. 자식 클레스가 생성될 떄 반드시 부모 클레스의 생성자까지 호출되어야 한다.

// 첫번째 원칙에 따라 Dog 에는 var, val 을 붙이지 않아 클레스 자체 속성으로 만들지 않는다.
class Dog (name: String, age: Int) : Animal (name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat (name: String, age: Int) : Animal (name, age, "고양이") {
    fun meow() {
        println("야옹 야옹")
    }
}