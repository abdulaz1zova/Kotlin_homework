package Homework_6

import java.util.Scanner

fun main(args: Array<String>) {


//    N butun son berilgan (n > 0). Quyidagi yeg'indini hisoblo'vchi programma tuzing.
//    S = 1 + 1/ 2 + 1/ 3 + 1/ 4 +...

    val input = Scanner(System.`in`)

    println("Enter your number: ")
    val n = input.nextInt()//3

    var i=1
    var sum=0.0
    while (i<=n){
        sum+=1/i.toDouble()
        i++
    }
    println(sum)


}