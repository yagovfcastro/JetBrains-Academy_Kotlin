package Struggles

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()

    for(i in 'a'..'z'){

        if (i in word) continue
        print(i)

    }
}