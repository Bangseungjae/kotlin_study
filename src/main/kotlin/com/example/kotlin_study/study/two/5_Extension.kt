package com.example.kotlin_study.study.two

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}
class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}
fun main() {
    var myExample: MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
    println("ABC".first())

    println("ABCD".addFirst('Z'))

    // 원래 클래스에서 정의한게 우선이 된다.
    MyExample().printMessage()
    MyExample().printMessage("확장 출력")
}