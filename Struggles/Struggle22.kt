package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val url = scanner.next()

    val splitURL = url.split("?").toTypedArray()

    val info = splitURL[1]

    val splitInfo = info.split("&").toTypedArray()

    for (i in splitInfo.indices) {
        splitInfo[i] = splitInfo[i].replace("=", " : ")
        if (splitInfo[i].length < 10) splitInfo[i] += "not found"
    }

    for (i in splitInfo) {
        println(i)
    }

    for (i in splitInfo.indices) {
        if (splitInfo[i].startsWith("pass")) {
            val a = splitInfo[i].split("pass : ")
            var stringX = ""
            for (j in a) {
                stringX += j
            }
            val b = stringX.toInt()
            print("password : $b")
        }
    }
}