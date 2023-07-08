package Homework_2

fun main(args: Array<String>) {

//    Task 3
//    Ikkita o’zgaruvchi qiymatlari o’rnini almashtiruvchi dasturni tuzing

    var number1 = 7
    var number2= 5
    val o = number1
    number1 = number2
    number2= o

    println("Number1 = $number1")
    println("Number2 = $number2")
}