package Homework_6

import java.util.*

fun main(args: Array<String>) {

//    Berilgan satrning har bir elementni 2 martadan takrorlab chiqaring. Masalan: "Kotlin"-"KKoottlliinn"

    val input = Scanner(System.`in`)

    println("Enter your string: ")
    val line = input.nextLine()
    var s = 0

    while (s < line.length) {
        val newString = line[s]
        print(newString)
        print(newString)
        s++
    }
}