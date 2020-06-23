package Struggles

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().first()
    val b = scanner.next().first()
    val c = scanner.next().first()
    val d = scanner.next().first()

    val e = a.isDigit()
    val f = b.isDigit()
    val g = c.isDigit()
    val h = d.isDigit()

    println("$e\\$f\\$g\\$h")

}