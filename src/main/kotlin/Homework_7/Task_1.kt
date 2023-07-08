package Homework_7

import java.util.Scanner

fun main(args: Array<String>) {

// Butun musbat sonining raqamlarini teskari tartibda chiqaruvchi InvertDigit nomli funksiya hosil qiling.

    val k = Scanner(System.`in`)
    val n = k.nextInt()

    println(InertDigit(n))

}

fun InertDigit(son: Int): Int {
    val sonSatr: String = son.toString()
    var teskariSon: String = ""
    var i = sonSatr.length

    while (i > 0) {
        teskariSon += sonSatr[i - 1].toString()
        i--
    }
    return teskariSon.toInt()
}