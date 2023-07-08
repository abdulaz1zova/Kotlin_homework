package Homework_7

import java.util.Scanner

fun main(args: Array<String>) {

//    Random holatda 3 ta turli hil sonlarni ekranga chiqaruvchi recursive funksiya tuzing.

    val k=Scanner(System.`in`)
    val n=k.nextInt()
    var res:Int
    res=Fact(n)
    println(res)

}

fun Fact(n: Int, sum: Int = 0): Int {

    return if (n == 0) {
        sum
    } else {
        Fact(n.div(10), sum = sum + n.rem(10))
    }

}