package Struggles

fun main() {
    val input = readLine()!!

    if (input.isEmpty()){
        println(" ")
        return
    }

    when (input.first()) {
        'i'-> {
            println(input.drop(1).toInt() + 1)
        }
        's' -> {
            println(input.drop(1).reversed())
        }
        else -> println(input)
    }
}
