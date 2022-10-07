package com.example.kotlin_study.study.two

fun main() {
    val client: DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    println(client)

    client.connect().run { println(this) }
}