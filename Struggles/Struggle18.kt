package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val dirX = IntArray(3)
    val dirY = IntArray(3)
    var final = ""
    var final2 = ""

    for (i in 0..2){
        dirX[i] = scanner.nextInt()
        dirY[i] = scanner.nextInt()
    }

    for (i in 1..5) {
            if(dirX[0] == i || dirX[1] == i || dirX[2] == i) continue
            final += "$i "
    }

    for (i in 1..5){
        if(dirY[0] == i || dirY[1] == i || dirY[2] == i) continue
        final2 += "$i "
    }

    println(final.trim())
    println(final2.trim())
}