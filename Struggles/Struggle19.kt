package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    val string1 = input.substring(0, 3)
    val string2 = input.substring(3,6)
    var sum1 = 0
    var sum2 = 0

    for (ch in string1) {
        sum1 += ch.toInt()
    }

    for (ch in string2) {
        sum2 += ch.toInt()
    }

    if (sum1 == sum2) {
        println("Lucky")
        return
    }

    println("Regular")
}