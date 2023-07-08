package Homework_10

import java.util.*

fun main(args: Array<String>) {
//    Ro'yxatdan o'tish tizimini tashkil qilish
//    Juda ko'plab tizimlarda email yoki username orqali ro'yxatdan o'tish talab etiladi.
//    Null safety mavzusini bilgan holda siz shunday tizim yaratingki, xohlansangiz username xohlasangiz email orqali
//    tizimga kirish imkoniyati yaratilsin.
//    Tizimda funksional imkoniyatlarini ko'rsatib bering.

    val scanner = Scanner(System.`in`)

    val userNamelar = arrayOfNulls<Int>(100)
    val pochtalar = arrayOfNulls<String>(100)

    var countUserName = 0
    var countPochta = 0
    while (true) {
        println(
            "1 -> Ro'yhatdan o'tish\n" +
                    "2 -> Kirish"
        )
        val k = scanner.nextInt()
        when (k) {
            1 -> {
                println(
                    "Ro'yhatdan o'tish uchun pochtangizni yoki\n" +
                            " username sifatida telefon raqamingizni (Misol: 991234567) kiriting: "
                )
                val userPoch: Any = scanner.next()
                val pochta: String? = userPoch as? String
                val userName: Int? = userPoch as? Int
                if (pochta != null) {
                    pochtalar[countPochta] = pochta
                    println("Siz ${pochtalar[countPochta]} orqali ro'yhatdan o'tdingiz ")
                    countPochta++
                } else
                    if (userName != null) {
                        userNamelar[countUserName] = userName
                        println("Siz ${userNamelar[countUserName]} elektron pochtasi orqali ro'yhatdan o'tdingiz")
                        countUserName++
                    }
            }

            2 -> {
                println("Tizimga kirish uchun userName yoki pochtangizni kiriting: ")
                val usPoch = scanner.next()
                val username: Int? = usPoch as? Int
                val pochta: String? = usPoch as? String
                var has = false
                if (username != null) {
                    for (i in 0..userNamelar.size - 1) {
                        if (username == userNamelar[i]) {
                            has = true
                        }
                    }
                } else {
                    for (element in pochtalar) {
                        if (pochta == element) {
                            has = true
                        }
                    }
                }
                if (has) println("Tizimga muvaffaqiyatli kirdingiz")
                else println("UserName yoki pochta xato")
            }
        }
    }

}