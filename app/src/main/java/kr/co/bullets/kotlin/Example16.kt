package kr.co.bullets.kotlin

//import kr.co.bullets.kotlin.Book.Companion.NAME
import kr.co.bullets.kotlin.Book.Novel.NAME

fun main() {
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)

    Counter.hello()

    println(Book.NAME)

    Book.create()

    // import kr.co.bullets.kotlin.Book.Companion.NAME
    // import kr.co.bullets.kotlin.Book.Novel.NAME
    NAME
}

// Constructors are not allowed for objects
//object Counter()

// 에러코드 정의할 때 많이 사용된다.
object Counter : Hello() {
    init {
        println("초기화")
    }

    var count = 0

    fun countUp() {
        count++
    }
}

open class Hello() {

    fun hello() = println("Hello")
}

class Book {

    // final static NAME = "name"

    // object Companion
    companion object Novel {
        const val NAME = "hello"
        fun create() = Book()
    }

    // Only one companion object is allowed per class
//    companion object {
//
//    }
}