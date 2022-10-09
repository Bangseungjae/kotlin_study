package com.example.kotlin_study.study.three

import java.io.IOException

class KotlinThrow {

    @Throws(IOException::class) // 예외 전파
    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")
    }
}

fun main() {
    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}