package kr.co.bullets.kotlin

fun main() {
    val person = Person("지영", 33)
    val dog = Rabit("뽀식이", 1)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat: Cat = BlueCat()
    val result = when (cat) {
        is BlueCat -> { "blue" }
        is RedCat -> { "red" }
        is GreenCat -> { "green" }
//        else -> { "none" }
        is WhiteCat -> { "white" }
    }
    println(result)
}

class Person(
    val name: String,
    val age: Int,
)

// Data class must have at least one primary constructor parameter
data class Rabit(
    val name: String,
    val age: Int
)

// Function 'component1' generated for the data class conflicts with member of supertype 'Rabit'
//data class Corgi(
//    val pretty: Boolean = true
//) : Rabit()

// sealed class: 에러 케이스를 체크하거나, 리사이클러뷰에서 뷰타입을 체크할 때 많이 사용
sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()