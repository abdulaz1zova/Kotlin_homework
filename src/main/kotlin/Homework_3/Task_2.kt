package Homework_3

fun main(args: Array<String>) {

//    Task 2
//    Birinchi avtomobilning tezligi v1, ikkinchisiniki v2, ular orasidagi masofa S.
//    Ular bir-biridan uzoqlasha boshlasa t vaqtdan keyin ular orasidagi masofani aniqlaydigan dastur tuzilsin.

    val v1: Int = 30
    val v2: Int = 40
    val t: Int = 10

    val s1: Int = v1 * t
    val s2: Int = v2 * t

    val distance: Int = s1 + s2

    println("Distance between 2 cars: $distance")

}