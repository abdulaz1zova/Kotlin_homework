package Homework_4

fun main(args: Array<String>) {

//    Task 7
//    Kiritilayotgan satrning o’rtasidagi 2 ta elementni chop qiladigan dastur yozing.

    val java: String = "Java"

    val one = java.substring(0, java.length - 2) //ja
    val two = java.substring(java.length - 2) //va
    val left = one.substring(one.length - 1) //a
    val right = two.substring(0, java.length - 3) //v

    println(left + right)
}