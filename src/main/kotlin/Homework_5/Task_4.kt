package Homework_5

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

//    Task 4
//    1-7 gacha bo'lgan butun sonlar berilgan. Kiritilgan songa mos ravishda  hafta kunlarini so'zda
//    ifodalovchi programma tuzilsin. (1-Dushanba, 2-Seshanba,...)

    println("Xafta kuni raqamini kiriting: ")

    val day = when (scanner.nextInt()) {
         1 -> "Dushanba"
         2 -> "Seshanba"
         3 -> "Chorshanba"
         4 -> "Payshanba"
         5 -> "Juma"
         6 -> "Shanba"
         7 -> "Yakshanba"
         else -> "Bunday hafta kuni yo'q"
     }

     println(day)

}