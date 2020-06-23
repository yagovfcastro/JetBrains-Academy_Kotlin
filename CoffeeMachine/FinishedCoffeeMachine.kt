
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val coffeeMachine = FinishedCoffeeMachine()

    do {
        val input = scanner.next()
        val continueLoop = coffeeMachine.work(input)
    } while (continueLoop)
}


enum class State() {
    WAITING,
    SELECTING_COFFEE,
    FILLING_WATER,
    FILLING_MILK,
    FILLING_COFFEE,
    FILLING_CUPS
}

class FinishedCoffeeMachine {
    private var waterInMachine = 400
    private var milkInMachine = 540
    private var coffeeBeansInMachine = 120
    private var disposableCupsInMachine = 9
    private var moneyInMachine = 550
    private var state: State

    init {
        state = State.WAITING
        menu()
    }

    fun work(input: String): Boolean {
        var continueLoop = true

        when (state) {
            State.WAITING -> {
                when (input) {
                    "buy" -> {
                        println()
                        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                        state = State.SELECTING_COFFEE
                    }
                    "fill" -> {
                        println()
                        print("Write how many ml of water do you want to add: > ")
                        state = State.FILLING_WATER
                    }
                    "take" -> {
                        println()
                        println("I gave you $$moneyInMachine")
                        moneyInMachine = 0
                        println()
                        menu()
                    }
                    "remaining" -> {
                        supplyState()
                    }
                    "exit" -> continueLoop = false
                }
            }
            State.SELECTING_COFFEE -> {
                when (input) {
                    "1" -> buyCoffee(1)
                    "2" -> buyCoffee(2)
                    "3" -> buyCoffee(3)
                    "back" -> menu()
                }
            }
            State.FILLING_WATER -> {
                print("Write how many ml of milk do you want to add: > ")
                waterInMachine += input.toInt()
                state = State.FILLING_MILK
            }
            State.FILLING_MILK -> {
                print("Write how many grams of coffee beans do you want to add: > ")
                milkInMachine += input.toInt()
                state = State.FILLING_COFFEE
            }
            State.FILLING_COFFEE -> {
                print("Write how many disposable cups do you want to add: ")
                coffeeBeansInMachine += input.toInt()
                state = State.FILLING_CUPS
            }
            State.FILLING_CUPS -> {
                disposableCupsInMachine += input.toInt()
                println()
                menu()
            }
        }
        return continueLoop
    }

        fun buyCoffee(nr: Int){
            when (nr) {
               1 -> {
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
                2 -> {
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
                3 -> {
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
            }
            menu()
        }

        fun supplyState() {
            println()
            println("The coffee machine has: ")
            println("$waterInMachine of water")
            println("$milkInMachine of milk")
            println("$coffeeBeansInMachine of coffee beans")
            println("$disposableCupsInMachine of disposable cups")
            println("$moneyInMachine of money")
            println()
            menu()
        }

        fun menu() {
            state = State.WAITING
            print("Write action (buy, fill, take, remaining, exit): > ")
        }
}