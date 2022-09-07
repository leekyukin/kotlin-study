// Companion Object
// class 의 instance 기능은 그대로 사용하면서
// instance 간의 공용으로 사용할 속성과 함수들을 별도로 만드는 기능
// 다른 언어에서 static 과 비슷한 개념이다.
fun main() {

    var a = foodPoll("짜장")
    var b = foodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${foodPoll.total}")
}

class foodPoll(val name: String) {
    companion object {
        var total = 0;
    }

    var count = 0;

    fun vote() {
        total++
        count++
    }
}