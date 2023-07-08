package Homework_7

import java.util.Scanner

fun main(args: Array<String>) {

//    Berilgan satrdagi barcha ‘x’ elementlarini satr so’ngiga o’tkazuvchi funksiya tuzilsin.Masalan:
//    ("xxre") → "rexx"
//    ("xxhixx") → "hixxxx"

    val input = Scanner(System.`in`)
    val satr = input.nextLine()
    println(Polindrom(satr))

}
var i=0
fun Polindrom(S: String, n:Int=S.length, k:Int=0): String{
    return if (k==n){
        S
    }else{
        if(S[0]=='x'){
            Polindrom(S.substring(1)+"x", n+0, k+1)
        }else{
            S[0]+Polindrom(S.substring(1), n+0, k+1)
        }
    }
}