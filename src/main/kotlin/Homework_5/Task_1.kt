package Homework_5

import kotlin.math.abs

fun main(args: Array<String>) {
//    Task 1
//    Sonlar o'qida uchta A, B, C nuqtalar berilgan. A nuqtaga eng yaqin nuqta va ular orasidagi masofa topilsin.

  val raqamA = 9
  val raqamB = 5
  val raqamC = 6

  if (abs(raqamA - raqamB) < (raqamA - raqamC)) {
      println("A nuqtaga yaqin nuqta B.")
  } else {
      println("A nuqtaga yaqin nuqta C.")
  }
}