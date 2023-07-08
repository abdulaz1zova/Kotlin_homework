package Homework_9

import java.util.Scanner

fun main(args: Array<String>) {

//    Haydovchilik guvohnomasini olish tizimini tashkil qiling. Bunda Exceptionlardan foydalaning.
    //    Bu tizimda o'zingiz loyiha yaratib guvohnoma berish tartibini shakllantirasiz.

    val scanner = Scanner(System.`in`)
    println("Enter your age: ")
    val age = scanner.nextInt()
    println("Enter your gradle: ")
    val gradle = scanner.nextInt()
    try {
        validate(age)
        ballHisobla(gradle)

    } catch (e: Exception) {
        println("Balingiz yoki/va yoshingiz yetmaydi")
    } finally {
        println(
            "Haydash uchun 18 yoshga to'lgan bo'lishingiz va\n" +
                    " testda 10 tadan kamida 9 ta to'g'ri javob bergan\n " +
                    "bo'lishingiz kerak!!!"
        )
    }

}

fun validate(age: Int) {
    if (age < 18) {
        throw ArithmeticException("age")
    }
}

fun ballHisobla(ball: Int) {
    if (ball < 9) {
        throw NullPointerException()
    }
}