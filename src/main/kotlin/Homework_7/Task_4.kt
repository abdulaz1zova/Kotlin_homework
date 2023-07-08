package Homework_7

import java.util.Scanner

fun main(args: Array<String>) {

//    N!=1*2*...*N faktorialni hisoblovchi haqiqiy  toifadagi Fact(N) rekursiv funksiyasi tuzilsin.
//    (N>0 - butun toifadagi parametr). Shu funksiya yordamida berilgan 3ta sonning faktoriallari hisoblansin.

    val k = Scanner(System.`in`)
    val n = k.nextInt()

    println(Fact(n))

}

fun Fact(K: Int): Int {

    return if (K == 1)
        1
    else {
        K * Fact(K - 1)
    }

}