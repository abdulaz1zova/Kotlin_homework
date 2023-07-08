package Homework_5

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

//    Task 3
//    1-999 oraliqdagi sonlar berilgan. Berilgan sonni "ikki xonali juft son", "uch xonali toq son"
//    va h.k ekranga yozadigan programma tuzilsin.

      print("Enter the number: ")
      val number = scanner.nextInt()

      if (number in 1..9) {
          if (number % 2 == 0) {
              println("Bir xonali juft son")
          } else {
              println("Bir xonali toq son")
          }
      } else if (number in 10..99) {
          if (number % 2 == 0) {
              println("Ikki xonali juft son")
          } else {
              println("Ikki xonali toq son")
          }
      } else if (number in 100..999) {
          if (number % 2 == 0) {
              println("Uch xonali juft son")
          } else {
              println("Uch xonali toq son")
          }
      } else println("Bunday son ro'yxatta mavjud emas.")

}