package Homework_8

fun main(args: Array<String>) {

//    n ta butun sonlardan iborat massiv berilgan. Massivdagi har bir toq sonni oxirgi toq songa orttiruvchi programma tuzilsin.
//    Agar toq sonlar bo'lmasa, massiv o'zgarishsiz qoldirilsin.

    val number = arrayOf(1, 2, 7, 4, 5, 14)

    var oxToq: Int = 1

    for (i in (number.size - 1).downTo(0)) {
        if (number[i] % 2 != 0) {
            oxToq = number[i]
            break
        }
    }
    for (i in number.indices) {
        if (number[i] % 2 != 0) {
            number[i] = number[i] + oxToq
            print("${number[i]} ")
        } else {
            print("${number[i]} ")
        }
    }

}