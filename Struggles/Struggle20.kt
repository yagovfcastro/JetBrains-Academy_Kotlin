package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    val n = scanner.nextInt()

    if (n > s.length) {
        println(s)
        return
    }

    val s1 = s.substring(0, n)
    val s2 = s.substring(n, s.lastIndex + 1)

    println(s2+s1)
}