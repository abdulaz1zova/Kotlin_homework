package Homework_4

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

//    Task 8
//    Kiritilgan string qiymatning oxirgi va undan oldingi element o’rinlarini o’zgartirgan holatda chop qiling.
//    Masalan: coding-> codign.

    println("Enter the number: ")
    val number = scanner.next()

    val lastElement = number.substring(number.length - 2) //ng
    val beginnerElement = number.substring(0, number.length - 2) // codi
    val beginner = lastElement.substring(lastElement.length - 1) //g
    val last = lastElement.substring(0, lastElement.length - 1) // n

    println(beginnerElement + beginner + last)

}