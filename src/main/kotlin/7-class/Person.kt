package `7-class`

fun main() {

    var a = Person("스티브 잡스", 1999)
    var b = Person("빌 게에츠", 1999)
    var c = Person("록 펠러", 1999)
    var d = Person("이규진", 1999)

    Person("이규진1")
    Person("제프 베이조스")
    Person("칸예 웨스트")

    d.introduce()
    a.introduce()
    c.introduce()
}

class Person(var name: String, val birthYear: Int) {

    init {
        println("init 호출")
    }

    constructor(name:String) : this(name, 1888) {
        println("보조 생성자 호출")
    }

    fun introduce() {
        println("name : ${this.name}, birth : ${this.birthYear}")
    }
}