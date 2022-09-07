fun main() {
    b(::a)

    // 람
    val c: (String) -> Unit = {str -> println("${str} 함수 c")}
    b(c)

    println("\n<반환형이 없는 람다>")
    // 여러줄 람다 함수
    val d: (String) -> Unit = { str ->
        println("$str 람다함수")
        println("여러 구문을")
        println("사용가능!")
    }
    d("D");

    println("\n<반환형이 있는 람다>")
    //              파라미터 타입   반환형
    val calculate: (Int, Int) -> Int = { a,b ->
        println("$a + $b = ${a + b}")
        a+b // 여러줄 람다에서 마지막 줄이 return 된다.
    }
    val result = calculate(1, 2)
    println(result)

    println("\n<파라미터가 없는 람다>")
    val a: () -> Unit = { println("파라미터가 없는 람다 호출") }
    a();

    println("\n<파라미터가 하나일 때는 \"it\"을 사용할 수 있다!>")
    val e: (String) -> Unit = { println("$it 람다함수")}
    e("파라미터가 하나인")
}

fun a (str: String) {
    println("${str} 함수 a")
}

// (String) -> Unit : String 을 받고 반환형은 없는 함수
fun b (function: (String) -> Unit) {
    function("b가 호출한")
}