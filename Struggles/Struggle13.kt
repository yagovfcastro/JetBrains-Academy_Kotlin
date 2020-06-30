package Struggles

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextLine().toInt()
    val array = IntArray(size)

    for(i in array.indices) array[i] = scanner.nextInt()

    val rotations = scanner.nextInt()

   repeat (rotations % size) {
       val a = array[array.lastIndex]
       for (i in array.lastIndex downTo 1) {
           array[i] = array[i - 1]
       }
       array[0] = a
    }

    for (i in array.indices) {
        print("${array[i]} ")
    }
}