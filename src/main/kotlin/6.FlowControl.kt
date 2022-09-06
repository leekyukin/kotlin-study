fun main() {

    // @ 앞에 레이블 이름을 명명해
    // break 같은 흐름제어 문에서 활용할 수 있다.
    // 아래의 break 는 바로 상위의 for 와
    // 최상위 for 문까지 중단 시킨다.
    // continue 도 마찬가지다.
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if(i == 1 && j == 2) break@loop
            println("i : ${i}, j : ${j}")
        }
    }
}