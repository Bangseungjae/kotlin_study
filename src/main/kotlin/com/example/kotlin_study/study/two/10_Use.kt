package com.example.kotlin_study.study.two

import java.io.FileWriter

fun main() {
    FileWriter("test.txt")
            .use {
                it.write("Hello Kotlin")
            }
}