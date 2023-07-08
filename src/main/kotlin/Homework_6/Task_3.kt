package Homework_6

import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
//    N butun soni va a haqiqiy soni berilgan (n>0). Bir sikldan foydalanib quyidagi a ning 1 dan n gacha bo'lgan barcha
//    darajalarini chiqaruvchi programma tuzilsin.

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = scanner.nextFloat()

    for (i in 1..n) {
        println(a.toDouble().pow(i.toDouble()))
    }

}