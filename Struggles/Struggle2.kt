package Struggles

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val check1 = (a > 0) && (b <= 0) && (c <= 0)
    val check2 = (b > 0) && (a <= 0) && (c <= 0)
    val check3 = (c > 0) && (a <= 0) && (b <= 0)

    val result = check1 || check2 || check3

    println(result)
}

//Eu li a porra do problema errado e fiquei uma hora tentando fazer coisa errada KKKKKKKKKKKKKKKKKKKKKK