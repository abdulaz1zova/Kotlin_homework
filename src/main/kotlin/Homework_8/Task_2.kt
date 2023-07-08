package Homework_8

import java.util.Scanner

fun main(args: Array<String>) {

//    N ta sonlardan iborat massiv berilgan. Bu massiv tarkibidagi toqlarni o'chiruvchi dastur tuzing. Hosil bo'lgan
//    massivning elementlari va sonini chiqaruvchi dastur tuzing.

    val number = arrayOf(1, 3, 2, 4, 5, 6, 7, 8, 9)
    for (i in number.indices){
        if (number[i] % 2 == 0) {
            println(number[i])
        }
    }

}