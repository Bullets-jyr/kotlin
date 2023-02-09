package kr.co.bullets.kotlin

fun main() {
    max(10, 3)
    isHoliday("금")
}

fun max(a: Int, b: Int) {
//    if (a > b) {
//        println(a)
//    } else {
//        println(b)
//    }

//    val result = if (a > b) {
//        a
//    } else {
//        b
//    }

    val result = if (a > b) a else b
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: Any) {
    // when의 return 값을 변수에 할당하지 않으면 else가 필요없음
    val result = when (val day = dayOfWeek) {
        "토",
        "일" -> if (day == "토") "좋아" else "너무 좋아"
         in 2..4 -> {}
         in listOf("월", "화") -> {}
        else -> "안좋아"
    }
    println(result)
}