package kr.co.bullets.kotlin

fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.add(6)
    list.addAll(listOf(7, 8, 9))

    val list1 = listOf<Int>(1, 2, 3, 4)
    // list1.add(5)
    list1.get(0)
    list1[0]

    println(list1.map { it * 10 }.joinToString("/"))

    val diverseList = listOf(1, "안녕", 1.78, true)

    println(list)
    println(list.joinToString(","))

    val map = mapOf<Int, String>((1 to "안녕"), (2 to "hello"))
    // map.put
    val map1 = mutableMapOf<Int, String>((1 to "안녕"), (2 to "hello"))
    map1.put(3, "응")
    map1[3] = "응"
    map1[100] = "호이"
}