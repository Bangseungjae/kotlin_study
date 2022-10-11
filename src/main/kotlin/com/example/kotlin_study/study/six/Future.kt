package com.example.kotlin_study.study.six

import com.example.kotlin_study.study.two.sum
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val pool: ExecutorService = Executors.newSingleThreadExecutor()
    val future = pool.submit(Callable {
        sum(100, 200)
    })

    println("계산 시작")
    val futureResult = future.get() // 비동기 작업의 결과를 기다린다
    println(futureResult)
    println("계산 종료")
}