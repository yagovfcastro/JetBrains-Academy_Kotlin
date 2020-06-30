package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()
    var total = 0

    for (i in word) {
        var count = 0
        for (j in word) {
            if(i == j) count++
            if(count > 1) break
        }
        if (count == 1) total++
    }

    println(total)
}