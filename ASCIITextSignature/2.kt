package ASCIITextSignature

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val fName = scanner.next()
    val lName = scanner.next()

    val printSize = fName.length + lName.length + 5

    repeat(printSize) {
        print("*")
    }

    println()
    println("* $fName $lName *")

    repeat(printSize) {
        print("*")
    }
}