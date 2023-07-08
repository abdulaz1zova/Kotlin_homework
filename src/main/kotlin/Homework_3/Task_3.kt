package Homework_3

fun main(args: Array<String>) {

//    Task 3
//    Uch xonali son berilgan. Uning o'nliklar xonasidagi raqam bilan birliklar xonasidagi raqamni almashtirishdan
//    hosil bo'lgan sonni aniqlovchi dastur tuzilsin.

    val number: Int = 157

    val n1: Int = number / 100
    val n2: Int = number / 10 % 10
    val n3: Int = number % 10

    println("$n1; $n2; $n3")

}