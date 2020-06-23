package ChattyBot

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Orianna.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    print("> ")
    val myName = scanner.next()

    println("What a great name you have, $myName!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    print("> ")
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()

    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")
}
