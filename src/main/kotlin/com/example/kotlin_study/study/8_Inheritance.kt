package com.example.kotlin_study.study

import org.springframework.boot.Banner

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(override var age: Int = 0): Dog() {


    override fun bark() {
        super.bark()
    }
}

class ChildBulldog : Bulldog() {
    override var age: Int = 0
    override fun bark() {
        super.bark()
    }
}

abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int = 0) : Developer() {
    override fun code(language: String) {
        println("I code with $language")
    }

}

fun main() {
    val backendDeveloper = BackendDeveloper(2)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

//    val dog = Bulldog(age = 2)
//    println(dog.age)
//    dog.bark()
}