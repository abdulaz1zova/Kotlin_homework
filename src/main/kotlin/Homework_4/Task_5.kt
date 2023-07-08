package Homework_4

fun main(args: Array<String>) {

//    Task 5
//    Berilgan string ma’lumotning oxirgi 2 ta elementini boshidan yozing. Masalan: Kotlin == inKotl

    val kotlin: String = "Kotlin"

    val end: String = kotlin.substring(kotlin.length - 2)
    val start: String = kotlin.substring(0, kotlin.length - 2)

    println(end + start)

}