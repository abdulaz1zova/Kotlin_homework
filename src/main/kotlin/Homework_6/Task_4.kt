package Homework_6

import java.util.*

fun main(args: Array<String>) {


// String xy-muvozanatlangan deb qarab, satrdagi "x" belgilaridan keyin satrda "y" char mavjud bo'lsa,
//    berilgan ifoda muvozanatlangan, yoki aksincha. Berilgan satr xy- muvozanatlangan bo'lsa, haqiqiy qiymatni qaytaring.
//    Masalan:
//    ("aaxbby") -> true
//    ("aaxbb") -> false
//    ("xaaxxbby") -> true
//    ("yyabxccy") -> true


    val input = Scanner(System.`in`)
    var satr = input.nextLine()
    satr += "f"
    var haa = 0

    val satrOlcham = satr.length

    var i = 0

    while (i < satrOlcham) {
        if (satr[i] == 'x') {
            var j = i
            while (j < satrOlcham - 1) {
                if (satr[j + 1] == 'y') {
                    haa = 1
                    break
                }
                j++
            }
        }
        i++
    }
    if (haa == 1) println(true)
    else println(false)

}