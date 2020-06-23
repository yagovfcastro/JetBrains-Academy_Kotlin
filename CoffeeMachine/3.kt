package CoffeeMachine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Write how many ml of water the coffee machine has: > ")
    val water = scanner.nextInt()
    val w = water / 200

    print("Write how many ml of milk the coffee machine has: > ")
    val milk = scanner.nextInt()
    val m = milk / 50

    print("Write how many grams of coffee beans the coffee machine has: > ")
    val coffee_beans = scanner.nextInt()
    val c = coffee_beans / 15

    print("How many cups of coffee you will need: > ")
    val cups = scanner.nextInt()

    val min = if (w <= m) {
        if (w <= c) {
            w
        } else c
    } else if (m <= c) {
        m
    } else c

    if (cups == min) {
        println("Yes, I can make that amount of coffee")
    } else if (cups < min) {
        println("Yes, I can make that amount of coffee (and even ${min - cups} more than that)")
    } else println("No, I can make only $min cups of coffee")

}