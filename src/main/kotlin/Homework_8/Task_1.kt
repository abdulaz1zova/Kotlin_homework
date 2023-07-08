package Homework_8

import java.util.Scanner

fun main(args: Array<String>) {

//    N ta natural son berilgan. Uning elementlarini teskari tartibda chiqaruvchi dastur tuzing.

    val scanner = Scanner(System.`in`)

    print("Enter your number: ")
    val n = scanner.nextInt()

    val intNumber = IntArray(n)

    for (i in intNumber.indices) {
        intNumber[i] += scanner.nextInt()
    }

    var reversed = ""

    for (i in intNumber.size - 1 downTo 0) {
        reversed += intNumber[i].toString()
    }

    println(reversed)
}