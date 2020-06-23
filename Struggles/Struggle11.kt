package Struggles

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine().toInt()
    var max = 0
    var secondMax = 0

    if (input == 1) {
        println(scanner.nextInt())
    } else {
        for (i in 1..input) {
            val a = scanner.nextInt()
            if (a > max) {
                max = a
            } else if (a in secondMax..max) secondMax = a
        }
        println(max * secondMax)
    }
}