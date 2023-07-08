package Homework_8

import java.util.Scanner

fun main(args: Array<String>) {

//    Massiv elementlari berilgan. Massivning ikkinchi eng katta elementini aniqlang.

    val k = Scanner(System.`in`)

    val number = arrayOfNulls<Int>(5)
    for (i in number.indices) {
        println("Massivning $i`- elementini kiriting: ")
        number[i] = k.nextInt()
    }
    var engKatta = number[0]
    for (i in number.indices) {
        if (engKatta!! < number[i]!!) {
            engKatta = number[i]
        }
    }
    println("1-eng katta element: $engKatta")
    var engKattadanKichik = number[0]
    var engKattadanKichik1 = number[0]
    for (i in number.indices) {
        if ((engKattadanKichik!! < number[i]!!)) {
            engKattadanKichik = number[i]
            if (engKattadanKichik!! < engKatta!!) {
                engKattadanKichik1 = engKattadanKichik
            }
        }
    }
    println("2-eng katta element : $engKattadanKichik1")


}