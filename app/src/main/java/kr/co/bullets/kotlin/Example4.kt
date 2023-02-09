package kr.co.bullets.kotlin

fun main() {
    val user = User("류지영")
    println(user.age)
    Kid("아이", 3, "male")
}

open class User(open val name: String, open var age: Int = 33)

class Kid constructor(override val name: String, override var age: Int) : User(name, age) {

    var gender: String = "female"

    init {
        println("초기화 중 입니다.")
    }

    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부생성자 호출")
    }
}