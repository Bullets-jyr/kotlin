package kr.co.bullets.kotlin

fun main() {
    val result = test(1, c = 5)
    test2(name = "류지영", nickname = "지영", id = "지영님")
    println(result)
    println(time1(1, 3))
    println(time2(1, 3))
}

// 2. 함수
// 오버로딩 대신 Default Value를 이용할 수 있다.
fun test(a: Int, b: Int = 3, c: Int = 4): Int {
    println(a + b)
    return a + b
}

fun test2(name: String, nickname: String, id: String) = println(name + nickname + id)

fun time1(a: Int, b: Int): Int {
    return a * b
}

fun time2(a: Int, b: Int) = a * b