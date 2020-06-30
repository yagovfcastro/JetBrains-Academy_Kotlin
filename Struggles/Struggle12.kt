package Struggles

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextLine().toInt()
    val companies = IntArray(size)
    var max = 0
    val tax = IntArray(size)
    var index = 1

    if(size == 0) {
        println("0")
        return
    }

    for (i in companies.indices) {
        companies[i] = scanner.nextInt()
    }

    for (i in companies.indices) {
        tax[i] = scanner.nextInt()
    }

    for (i in companies.indices) {
        if(companies[i] * tax[i] > max) {
            max = companies[i] * tax[i]
            index = i + 1
        }
    }
    println(index)
}