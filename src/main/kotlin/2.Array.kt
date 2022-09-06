fun main() {
    var intArr = arrayOf(1,2,3,4,5);

    println(intArr) // intArr 주소 나옴

    var nullArr = arrayOfNulls<Int>(5); // null 로 채워진 배열 반환

    intArr[1] = 100;
    println(intArr[1]);
}