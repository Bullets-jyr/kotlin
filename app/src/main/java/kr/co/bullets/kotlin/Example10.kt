package kr.co.bullets.kotlin

fun main() {
    val a = 10
    val name = "안녕"
    val isHigh = true

//    println(a.toString() + name + isHigh.toString())
//    String.format("%s %d", name, a)
    println("$a ${name.length} $isHigh")
}