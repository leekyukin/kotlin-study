fun main() {

    // apply : 람다 함수에서 참조연산자 없이 속성과 함수를 조작할 수 있다.
    // 즉, 생성하자마자 조작된 객체를 반환되어져 사용할 수 있다.
    var a = Book("토비의 스프링", 10000).apply {
        name += " [초특가]"
        discount()
    }

    println("name: " + a.name)
    println("price: " + a.price)

    // run : 참조연산자를 사용하지 않는다는 점은 apply 와 같지만
    // 일반 람다함수처럼 마지막 줄을 반환한다.
    var bookName = Book("성경", 1000000000).run {
            name
    }
    println("bookName : $bookName")

    // with: run 과 100% 똑같고 파라미터로 객체를 받는다는 차이밖에 없다
    var name = with(Book("Takahiro Moyasita The Soloist", 100000)) {
        name
    }
    println(name)
}

class Book(var name: String, var price: Int)
{
    fun discount()
    {
        price -= 2000;
    }
}