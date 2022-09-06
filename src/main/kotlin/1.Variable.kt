fun main(args: Array<String>) {

    var a: String = "sdf";
    val b: Int = 123;
//    b = 12;   val : 자바의 final, 값 변경 불가능

    println(a + b);

    var c: Int? = null;
// 기본적으로 null 사용이 불가능하나
// 자료형뒤에 ? 를 붙이면 nullable 변수가 된다.

    println(c); // null 이 출력됨

    var d: Long = b.toLong();   // Int -> Long 명시적 형변환
    println(d)  // ; 필요 없음

    val e: Long = 123L;     // Long type 이라고  슛자뒤에 L 붙여줘야함


    val f: String = """
        ==========
        여러줄
        문자열 
        출력하기
        🌱
        ==========
    """.trimIndent();

    println(f)
}