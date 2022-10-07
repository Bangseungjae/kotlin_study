package com.example.kotlin_study.study.two

// f(1, 3) = 1 + 3 = 4
// f(1, 3) = 1 + 3 = 4
//data class Tuple(val a : Int, val b: Int)

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A", 1)
    val copy = pair.copy(first = "B")
    println(copy)

    val second = copy.component2()
    println(second)

    val toList = copy.toList()
    println(toList)

    val triple = Triple("A", "B", "C")
    println(triple)
    triple.first
    triple.second
    triple.third

    val newTriple = triple.copy(third = "D")
    println(newTriple)

    println(newTriple.component3())

    val (a: String, b: String, c: String) = newTriple
    println("$a, $b, $c")

    val list3 = newTriple.toList()
    val (a1, a2, a3) = list3

    println("$a1, $a2, $a3")

    list3.component1()
    list3.component2()
    list3.component3()
//    list3.component4()
//    list3.component5() // 5까지 존재

    val map = mutableMapOf("이상훈" to "개발자")
    for ((key, value) in map) {
        println("${key}의 직업은 $value")
    }

}