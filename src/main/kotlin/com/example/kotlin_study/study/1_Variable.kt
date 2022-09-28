package com.example.kotlin_study.study

var x = 5 // 탑 레벨에 위치한다.

fun main() {

    x += 1
    println(x)
    val a : Int = 1

    val b = 1

    val c : Int
    c = 3

    // val(value) - final 키워드처럼 한번 초기화하면 재할당 불가능
    // var(variable) - 가변 변수

    val e : String = "Hello"
//    e = "World"   - 안된다.

    var f = 123
//    f = "hi" - 안된다.
}