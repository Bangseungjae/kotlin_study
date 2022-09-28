package com.example.kotlin_study.study

fun main() {

    // 범휘 연산자..를 사용해 for loop 돌리기
    for (i in 0..3){
        print("$i ")
    }
    print("\n---------------\n")

    // unit 을 사용해 반복한다
    // 뒤에 온 숫자는 포함하지 않는다
    for (i in 0 until 3) {
        print("$i ")
    }
    print("\n---------------\n")

    // step 에 들어온 값 만큼 증가시킨다
    for (i in 0..6 step 2) {
        print("$i ")
    }
    print("\n---------------\n")

    // downTo를 사용해 반복하면서 값을 감소시킨다
    for (i in 3 downTo 1) {
        print("$i ")
    }
    print("\n---------------\n")

    // 전달받은 배열을 반복
    val numbers = arrayOf(1,2,3)

    for (i in numbers) {
        print("$i ")
    }
}