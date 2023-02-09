package kr.co.bullets.kotlin

fun main() {
    var name: String = "지영"
    // name = null
    var number: Int = 10
    // number = null

    // var nickname: String? = null
    var nickname: String? = "루이"
    var secondNumber: Int? = null

//    val result = if (nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }
     nickname = null
    // nickname = "안녕"
    // val result = nickname ?: "값이 없음"
    // println(result)
    val size = nickname?.length
    println(size)
}