package kr.co.bullets.kotlin

//var text: String? = null

lateinit var text: String
// 'lateinit' modifier is not allowed on properties of primitive types
// lateinit var age: Int
lateinit var age: Integer

// 값을 호출하는 시점에 초기화를 합니다.
val test: Int by lazy {
    println("초기화 중")
    100
}

fun main() {
    text = "name"
    age = Integer(10)

    println(text)
    println("메인 함수 실행")
    println("초기화 한 값 $test")
    println("두번째 호출 $test")
}