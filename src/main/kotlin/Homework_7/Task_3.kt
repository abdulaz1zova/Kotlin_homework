@file:Suppress("UNREACHABLE_CODE")

package Homework_7

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {

//    IsSquare(K) mantiqiy funksiyasini hosil qiling. (K>0). Agar K biror butun sonning kvadrati bo’lsa- true,
//    aks holda false qiymati qaytarilsin.

    val k = Scanner(System.`in`)
    val n = k.nextInt()

    println(isSquare(n))

}

fun isSquare(K: Int): Boolean {

    for (i in 1..sqrt(K.toDouble()).toInt()) {
        if (i * i == K) {
            return true
            break
        }
    }

    return false

}
