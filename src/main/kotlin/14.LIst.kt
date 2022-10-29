fun main() {

    // listOf() : 불변 리스트 생성
    // 수정, 삭제, 추가 불가능

    val a = listOf("겜드", "게임드래곤", "GD")
    println(a[1])

    for (gd in a) {
        println(gd)
    }

    println()

    // mutableListOf() : 가변 리스트 생성
    // 수정, 삭제, 추가 가능

    val b = mutableListOf(12, 18, 17, 13)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 28)
    println(b)

    b.removeAt(5)
    println(b)

    // 무작위 섞기
    b.shuffle()
    println(b)
}