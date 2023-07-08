package Homework_5

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

//    Task 2
//    OX va OY koordinata o'qlarida yotmaydigan nuqta berilgan. Nuqta joylashgan koordinata choragi aniqlansin.

    println("Enter X: ")
    val x = scanner.nextInt()
    println("Enter Y: ")
    val y = scanner.nextInt()

    if (x > 0 && y > 0) {
        println("1-quarter")
    } else if (y > 0 && x < 0) {
        println("2-quarter")
    } else if (x < 0 && y < 0) {
        println("3-quarter")
    } else if (y < 0 && x > 0) {
        println("4-quarter")
    } else {
        println("No such quarter exists!")
    }

}