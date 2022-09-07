fun main() {

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)
}

// object : kotlin 자체 지원하는 Singleton Pattern 객체.
// 싱글톤이므로 생성자는 사용하지 않는다
// 최초 사용시 자동으로 생성된다.
object Counter {
    var count = 0;

    fun countUp() {
        count++;
    }

    fun clear() {
        count = 0;
    }
}