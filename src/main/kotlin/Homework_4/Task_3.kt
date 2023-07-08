package Homework_4

import kotlin.math.max

fun main(args: Array<String>) {

//    Task 3
//    Berilgan 3 ta sondan kattasini chiqaruvchi dastur tuzing.

    val number1: Int = 5
    val number2: Int = 10
    val number3: Int = 7

    val result1 = max(number1, number2)
    val result2 = max(result1, number3)

    println("Big number: $result2")

}