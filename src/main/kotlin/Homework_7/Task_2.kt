package Homework_7

import java.util.Scanner

fun main(args: Array<String>) {

//Haqiqiy sonning ishorasini aniqlovchi ishora nomli funksiya hozil qiling. Funksiya argumenti noldan kichik bo’lsa -1,
// noldan katta bo’lsa 1, nolga teng bo’lsa 0 qiymat qaytarsin.

    Ishora()

}

fun Ishora() {

    val input = Scanner(System.`in`)

    print("Enter your number: ")
    val number = input.nextInt()

    if (number > 0) {
        println("1")
    } else if (number < 0) {
        println(" -1 ")
    } else {
        println("0")
    }

}