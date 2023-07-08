package Homework_4

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

//    Task 9
//    Kiritilgan stringning berilgan indexdan boshlab qolgan qismini chop qiluvchi dastur yozing.
//    Masalan: String: android, index=2  Natija: “droid”;

    println("Enter the number: ")
    val android = scanner.next()

    val index = 2

    println(android.substring(index))

}