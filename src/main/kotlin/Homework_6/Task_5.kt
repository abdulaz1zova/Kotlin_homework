package Homework_6

import java.util.Scanner


fun main(args: Array<String>) {

// A va B butun soni berilgan (A-B). A va B sonlari orasidagi barcha butun sonlarni chiqaruvchi programma tuzilsin.
//    Bunda A soni 1 marta, (A + 1) soni 2 marta chiqariladi va h.k

    val input = Scanner(System.`in`)
    val A = input.nextInt()
    val B = input.nextInt()

    for (i in A..B) {
        var j = i
        while (j > 0) {
            println(i)
            j--
        }
    }

}