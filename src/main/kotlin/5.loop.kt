fun main() {
    // while, do while 자바랑 같음
    // 증감연산자도 같음

    // 0~9 반복
    for (i in 0..9) {
        print(i)
    }
    println()

    // 9~0 반복
    for (i in 9 downTo 0) {
        print(i)
    }
    println()

    // 0~9 3칸씩 반복
    for (i in 0..9 step(3)) {
        print(i)
    }
    println()

    // 9~0 3칸씩 반복
    for (i in 9 downTo 0 step(3)) {
        print(i)
    }
    println()

    // a~e 반복
    for (c in 'a'..'e') {
        print(c)
    }
    println()

}