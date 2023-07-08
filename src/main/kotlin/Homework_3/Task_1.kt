package Homework_3

import kotlin.math.sqrt

fun main(args: Array<String>) {

//    Task 1
//    Doiraning yuzasi S berilgan. Uning diametri d va radiusi R aniqlansin. PI = 3.14 deb oling.

    val pi: Double = 3.14
    val s: Int = 60

    val diameter = sqrt(4 * s / pi)
    val radius = diameter / 2

    println("Diameter: $diameter")
    println("Radius: $radius")

}