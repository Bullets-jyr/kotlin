package kr.co.bullets.kotlin

fun main() {
    // local variable!!!

    // let, run, apply, also, with
    // 1. let
    val a = 3
    a.let {  }
    // val user = ScopeUser("류지영", 10, true)

    // 수신객체.let { it 또는 scopeUser ->
    //
    // 마지막 줄 // return
    // }
//    val age = user.let { user ->
        // user.age
//        user.gender
//    }
//    println(age)

    var user: ScopeUser? = ScopeUser("류지영", 10, true)
    // user.age
    val age = user?.let {
        it.age
    }
    println(age)

    // 2. run
    // 수신객체.run {
    //
    // 마지막 줄 // return
    // }
    val kid = ScopeUser("아이", 4, false)
    val kidAge = kid.run {
        // age 가능
        this.age
    }
    println(kidAge)

    // 3. apply (run하고 비교하기)
    // 초기화
    // 수신객체.apply { this ->
    //
    // }
    // return 값이 수신객체
    val kidName = kid.apply {
        name
    }
    println(kidName)

    val female = ScopeUser("지영", 20, true, true)
    val femaleValue = female.apply {
        hasGlasses = false
    }
    println(femaleValue.hasGlasses)

    // 4. also (let하고 비교하기)
    // 수신객체의 초기화 보다는 수신객체에대한 내용을 로그로 확인하고 싶을 때 주로 사용
    // 수신객체.also { it -> // 원하는 local variable it 선언 가능
    //
    // }
    // return 수신객체 (자기자신)
    val male = ScopeUser("민수", 17, false, true)
    val maleValue = male.also { user ->
        println(user.name)
        user.hasGlasses = false
    }
    val maleValue2 = male.also {
        println(it.name)
        it.hasGlasses = false
    }
    println(maleValue.hasGlasses)

    // 5. with
    // with (수신객체) {
    //
    // 마지막줄 // return
    // }
    val result = with (male) {
        hasGlasses = false
        true
    }
}

class ScopeUser(
    val name: String,
    val age: Int,
    val gender: Boolean, // true: female, false: male
    var hasGlasses: Boolean = true
)