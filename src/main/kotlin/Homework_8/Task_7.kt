package Homework_8

import java.util.*

fun main(args: Array<String>) {
//    Massivlar yordamida lug'at dasturini yarating. So'zlarni qo'shish 2 turda olib boriladi.
//    Masalan, so'z qo'shish ENG->UZB yoki UZB->ENG. So'z va tarjimasini qo'shish, o'chirish, o'zgartirish,
//    barcha so'zlar ro'yxati(bunda 2 turda so'zlarni chiqarish imkoniyati bo'lsin), so'z qidirish.
//    Men tizimga 2 ta turda so'zlarni qo'sha olishim ularni boshqara olishim kerak.


    val scanner = Scanner(System.`in`)
    val inglizchaSoz = arrayOfNulls<String>(100)
    val ozbekchaSoz = arrayOfNulls<String>(100)

    var count = 0

    while (true) {
        println(
            "1 -> So'z qo'shish ENG->UZB\n" +
                    "2 -> So'z qo'shish UZB->ENG\n" +
                    "3 -> Inglizcha so'z qidirish\n" +
                    "4 -> O'zbekcha so'z qidirish\n" +
                    "5 -> so'zni o'chirish\n" +
                    "6 -> so'zni tahrirlash\n" +
                    "7 -> Barcha so'zlar ro'yhatini ko'rish"
        )

        val n=scanner.nextInt()

        when(n){

            1 -> {
                println("So'zning inglizchasini kiriting: ")
                val ingSoz = scanner.next()
                println("So'zning o'zbekchasini kiriting: ")
                val ozSoz = scanner.next()
                inglizchaSoz[count] = ingSoz
                ozbekchaSoz[count] = ozSoz
                count++
                println("So'z xotiraga yozildi")
            }

            2 -> {
                println("So'zning o'zbekchasini kiriting: ")
                val ozSoz = scanner.next()
                println("So'zning inglizchasini kiriting: ")
                val ingSoz = scanner.next()
                inglizchaSoz[count] = ingSoz
                ozbekchaSoz[count] = ozSoz
                count++
                println("So'z xotiraga yozildi")
            }

            3 -> {
                println("Qidirmoqchi bo'lgan inglizcha so'zingizni kiriting: ")
                val ingSoz = scanner.next()
                var has = true
                for (i in 0..count) {
                    if (inglizchaSoz[i]?.lowercase(Locale.getDefault()) == ingSoz.lowercase(Locale.getDefault())) {
                        println("${inglizchaSoz[i]} - ${ozbekchaSoz[i]}")
                        has = false
                        break
                    }
                }
                if (has) println("Bazada bunday so'z topilmadi")
            }

            4 -> {
                println("Qidirmoqchi bo'lgan o'zbekcha so'zingizni kiriting: ")
                val ozSoz = scanner.next()
                var has = true
                for (i in 0..count) {
                    if (ozbekchaSoz[i].equals(ozSoz, ignoreCase = true)) {
                        println("${ozbekchaSoz[i]} - ${inglizchaSoz[i]}")
                        has = false
                        break
                    }
                }
                if (has) println("Bazada bunday so'z topilmadi")
            }

            5 -> {
                println("O'chirmoqchi bo'lgan so'zingizni kiriting: ")
                val deleteSoz = scanner.next()
                var isHave = false
                var index = 1
                for (i in 0..count) {
                    if (inglizchaSoz[i] == deleteSoz || ozbekchaSoz[i] == deleteSoz) {
                        isHave = true
                        index = i
                        break
                    }
                }
                if (isHave) {
                    for (i in index..count) {
                        inglizchaSoz[i] = inglizchaSoz[i + 1]
                        ozbekchaSoz[i] = ozbekchaSoz[i + 1]
                    }
                    inglizchaSoz[count - 1] = null
                    ozbekchaSoz[count - 1] = null
                    count--
                    println("So'z muvaffaqiyatli o'chirildi")
                } else {
                    println("Bunday so'z topilmadi")
                }
            }

            6 -> {
                println("O'zgartiriladigan so'zni kiriting: ")
                val editSoz = scanner.next()
                var isHave = false
                var index = -1
                for (i in 0..count) {
                    if (ozbekchaSoz[i] == editSoz || inglizchaSoz[i] == editSoz) {
                        isHave = true
                        index = i
                        break
                    }
                }
                if (isHave) {
                    println("Yangi so'zni kiriting: ")
                    val newSoz = scanner.next()
                    if (inglizchaSoz[index] == editSoz) {
                        inglizchaSoz[index] = newSoz
                    } else ozbekchaSoz[index] = newSoz
                }
            }

            7 -> {
                for (i in 0 until count) {
                    println("${inglizchaSoz[i]} - ${ozbekchaSoz[i]}")
                }
            }
        }


    }


}