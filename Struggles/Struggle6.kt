package Struggles

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    var count = 1

    do {
        println(count * count)
        count++
    } while(input >= count * count)
}