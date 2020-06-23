package Struggles

import java.util.Scanner

fun machineState(water: Int, milk: Int, coffee: Int, cups: Int, money: Int){
    println()
    println("The coffee machine has: ")
    println("$water of water")
    println("$milk of milk")
    println("$coffee of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
    println()
}

fun main() {
    val scanner = Scanner(System.`in`)
    var waterInMachine = 400
    var milkInMachine = 540
    var coffeeBeansInMachine = 120
    var disposableCupsInMachine = 9
    var moneyInMachine = 550
    var continueLoop = true

    while (continueLoop) {
        print("Write action (buy, fill, take, remaining, exit): > ")
        when (scanner.next()) {
            "buy" -> {
                println()
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                when (scanner.next()) {
                    "1" -> {
                        if(waterInMachine < 250) {
                            println("Sorry, not enough water!")
                            println()
                        } else if (coffeeBeansInMachine < 16) {
                            println("Sorry, not enough coffee beans!")
                            println()
                        } else if (disposableCupsInMachine < 1) {
                            println("Sorry, not enough disposable cups!")
                            println()
                        } else {
                            println("I have enough resources, making you a coffee!")
                            waterInMachine -= 250
                            coffeeBeansInMachine -= 16
                            moneyInMachine += 4
                            disposableCupsInMachine -= 1
                            println()
                        }
                    }
                    "2" -> {
                        if(waterInMachine < 350) {
                            println("Sorry, not enough water!")
                        } else if (milkInMachine < 75){
                            println("Sorry, not enough milk!")
                        } else if (coffeeBeansInMachine < 20) {
                            println("Sorry, not enough coffee beans!")
                        } else if (disposableCupsInMachine < 1) {
                            println("Sorry, not enough disposable cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            waterInMachine -= 350
                            milkInMachine -= 75
                            coffeeBeansInMachine -= 20
                            moneyInMachine += 7
                            disposableCupsInMachine -= 1
                            println()
                        }
                    }
                    "3" -> {
                        if(waterInMachine < 200) {
                            println("Sorry, not enough water!")
                        } else if (milkInMachine < 100){
                            println("Sorry, not enough milk!")
                        } else if (coffeeBeansInMachine < 12) {
                            println("Sorry, not enough coffee beans!")
                        } else if (disposableCupsInMachine < 1) {
                            println("Sorry, not enough disposable cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            waterInMachine -= 200
                            milkInMachine -= 100
                            coffeeBeansInMachine -= 12
                            moneyInMachine += 6
                            disposableCupsInMachine -= 1
                            println()
                        }
                    }
                    "back" -> {
                        continueLoop = true
                        println()
                    }
                }
            }
            "fill" -> {
                println()
                print("Write how many ml of water do you want to add: > ")
                waterInMachine += scanner.nextInt()
                print("Write how many ml of milk do you want to add: > ")
                milkInMachine += scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: > ")
                coffeeBeansInMachine += scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: >")
                disposableCupsInMachine += scanner.nextInt()
                println()
            }
            "take" -> {
                println()
                println("I gave you $$moneyInMachine")
                moneyInMachine = 0
                println()
            }
            "remaining" -> {
                machineState(waterInMachine, milkInMachine, coffeeBeansInMachine, disposableCupsInMachine, moneyInMachine)
            }
            "exit" -> continueLoop = false
        }
    }
}