package Homework_8

import java.util.Scanner

fun main(args: Array<String>) {
//    m va n butun musbat sonlar berilgan , mxn o’lchamli matritsani hosil qiling.

    val k=Scanner(System.`in`)
    val m=k.nextInt() //qator
    val n=k.nextInt() //ustun

    val matritsa= Array(m) {IntArray(n)}

    for (i in matritsa.indices) {
        for (j in matritsa.indices) {
            matritsa[i][j]=i*10
        }
    }
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matritsa[i][j]}  ")
        }
        println()
    }

}