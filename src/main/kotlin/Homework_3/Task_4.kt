package Homework_3

fun main(args: Array<String>) {

//    Task 4
//    Kun boshidan boshlab N sekund vaqt o'tdi. Kun boshidan boshlab qancha soat,
//    minut va sekund o'tganini aniqlovchi dastur tuzilsin.

    var second: Int = 3681

    val hour: Int = second / 3600

    second %= 3600
    val minute: Int = second / 60

    second %= 60

    println("Hour: $hour, minute: $minute, second: $second")
}