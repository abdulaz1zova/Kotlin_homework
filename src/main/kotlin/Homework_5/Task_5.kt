package Homework_5

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

//    Task 5
//    Oy raqami berilgan. Shu oyda necha kun borligini aniqlovchi programma tuzilsin.

    println("Oy raqamini kiriting: ")

    when (scanner.nextInt()) {
        1 -> println("Yanvar 31 kun")
        2 -> println("Fevral 28 kun")
        3 -> println("Mart 31 kun")
        4 -> println("Aprel 30 kun")
        5 -> println("May 31 kun")
        6 -> println("Iyun 30 kun")
        7 -> println("Iyul 31 kun")
        8 -> println("Avgust 30 kun")
        9 -> println("Sentabr 30 kun")
        10 -> println("Oktabr 31 kun")
        11 -> println("Noyabr 30 kun")
        12 -> println("Dekabr 31 kun")
        else -> println("Bunday oy yo'q.")
    }
}