package Struggles

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name1 = scanner.next()
    val name2 = scanner.next()
    val age = scanner.nextInt()

    println("${name1[0]}. $name2, $age years old")
}