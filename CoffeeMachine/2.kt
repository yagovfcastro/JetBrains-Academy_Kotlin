package CoffeeMachine

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Write how many cups of coffee you will need: > ")
    val cups = scanner.nextInt()
    val water = cups * 200
    val milk = cups * 50
    val coffee_beans = cups * 15

    println("For $cups cups of coffee you will need:" )
    println("$water ml of water")
    println("$milk ml of milk")
    println("$coffee_beans g of coffee beans")

    println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready!")
}