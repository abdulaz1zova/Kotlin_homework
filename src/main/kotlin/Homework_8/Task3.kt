package Homework_8

fun main(args: Array<String>) {

//    N ta sonlardan iborat massiv berilgan. Massivning har bir elementini uning o’ng qo’shnisi bilan
//    o’rta arifmetigiga almashtiruvchi dastur tuzing.

    val number = arrayOf(1.0, 3.0, 7.0, 4.0, 5.0)

    for (i in number.indices) {
        if (i < number.size - 1) {
            number[i] = (number[i] + number[i + 1]) / 2
            println(number[i])
        } else {
            println(number[i])
        }
    }

}