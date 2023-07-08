package Homework_4

import kotlin.math.ceil
import kotlin.math.pow

fun main(args: Array<String>) {

//    Task1
//    Kotlinda qiymatning kub ildizini qanday olish mumkin? Sodda dastur yarating.
//    Misol: 125 = 5

    val number: Double = 125.0
    val a: Double = 1.0 / 3.0

    val natija = ceil(number.pow(a))

    println(natija)
}
