package com.example.kotlin_study.study.two

fun main() {

    val str: String? = "안녕"

    // null이 아닌 경우에 사용될 로직을 작성 한다
    val result: Int? = str?.let {
        println(it)
        1234
    }

    // 이렇게 중첩으로 널 검사를 해야된다면 if문이 더 나을 수도 있다.
    val abc: String? = "abc"
    val def: String? = "def"
    if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
        println("abcdedf가 null이 아님")
    }

    println(result)


}