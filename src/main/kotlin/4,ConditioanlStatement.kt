fun main() {
    // if 문 자바랑 똑같음. 연산자도 같음

//  자료형 확인
   println(1 is Int);

// 다중 조건문 when (switch 문을 간편하게 바꿈)
    doWhen(1)
    doWhen(1L)
    doWhen("sdfsdf")
    doWhen(true)
    doWhen("hi")
    doWhen(3)

    returnWhen(1L)
}

// Any : 아무값이나 상관없는 최상위 타입
fun doWhen(a: Any) {
    when(a) {
        1 -> println("정수 1입니다.")
        "hi" -> println("hi bye")
        is Long -> println("Long 임" )
        !is String -> println("문자열 아님")
        else -> println("어떤 조건도 만족 X")
    }


}

fun returnWhen(a: Any) {
    var result = when(a) {
        1 -> "정수 1입니다."
        "hi" -> "hi bye"
        is Long -> "Long 임"
        !is String -> "문자열 아님"
        else -> "어떤 조건도 만족 X"
    }

    println(result)
}