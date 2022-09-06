fun main() {
    val a = add(1,2,3);

    val b = minus(a ,5);

    println(a)
    println(b)
}

//                              반환형
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c;
}

// 딘일 표현식 함수 (반환형은 추론이 가능함으로 생량한다.
fun minus(a: Int, b: Int) = a-b;