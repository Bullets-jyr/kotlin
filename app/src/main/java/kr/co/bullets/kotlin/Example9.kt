package kr.co.bullets.kotlin

fun main() {
//    println(check("안녕"))
//    println(check(3))
//    println(check(true))
//    cast("안녕")
//    cast(10)
    println(smartcast("안녕"))
    println(smartcast(10))
    println(smartcast(true))
}

fun check(a: Any): String {
//    return if (a is String) {
//        "문자열"
//    } else if (a is Int) {
//        "숫자"
//    } else {
//        "몰라요"
//    }
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라요"
        }
    }
}

fun cast(a: Any) {
//    if (a is String) {
//        (a as String).length
//    }
    // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    val result = (a as? String) ?: "실패"
    println(result)
}

fun smartcast(a: Any): Int {
    return if (a is String) {
        a.length
    } else if (a is Int) {
        a.dec()
    } else {
        -1
    }
}