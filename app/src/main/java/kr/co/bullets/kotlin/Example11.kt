package kr.co.bullets.kotlin

fun main() {
    // 1. 익명함수
    // 2. 변수처럼 사용되서, 함수의 argument, return
    // 3. 한 번 사용되고, 재사용되지 않는 함수
    val a = fun() { println("hello") }
    val c: Int = 10
    // val b: (Int) -> Int = { a ->  }
    val b: (Int) -> Int = { it * 10 }
    val d = { i: Int, j: Int -> i * j }
    // val e = { i, j -> i * j }
    val f: (Int, String, Boolean) -> String = { a, b, c -> b }
    // val f: (Int, String, Boolean) -> String = { _, b, _ -> b }

    println(b)
    println(b(10))

    hello(10, b)
}

fun hello(a: Int, b: (Int) -> Int): (Int) -> Int {
    println(a)
    println(b(20))
    return b
}