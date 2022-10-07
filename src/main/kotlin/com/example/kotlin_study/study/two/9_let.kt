package com.example.kotlin_study.study.two

fun main() {

    val str: String? = "안녕"

    // null이 아닌 경우에 사용될 로직을 작성 한다
    val result: Int? = str?.let {
        println(it)
        1234
    }

    val abc: String? = "abc"
    val def: String? = "def"
    if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
        println("abcdedf가 null이 아님")
    }

    println(result)


}