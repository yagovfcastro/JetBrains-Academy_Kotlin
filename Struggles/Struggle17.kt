package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next().first()

    for (i in 'a'..'z') {
        if (i == letter) return
        print(i)
    }
}