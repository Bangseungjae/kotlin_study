package com.example.kotlin_study.study.two

fun main() {
    val str = "안녕하세요"

    val length = with(str) {
        length
    }
    println(length)


    val connected: Boolean = DatabaseClient().run {
        url = "localhost:3036"
        username = "mysql"
        password = "1234"
        connect()
    }

    val result: Boolean = with(DatabaseClient()) {
        url = "localhost:3036"
        username = "mysql"
        password = "1234"
        connect()
    }


}