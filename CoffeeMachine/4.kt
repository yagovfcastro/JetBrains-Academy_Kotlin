package CoffeeMachine

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

    Struggles.machineState(
        waterInMachine,
        milkInMachine,
        coffeeBeansInMachine,
        disposableCupsInMachine,
        moneyInMachine
    )

    print("Write action (buy, fill, take): > ")

    when (scanner.next()) {
        "buy" ->{
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
            when(scanner.nextInt()){
                1 -> {
                    waterInMachine -= 250
                    coffeeBeansInMachine -= 16
                    moneyInMachine += 4
                    disposableCupsInMachine -= 1
                }
                2 -> {
                    waterInMachine -= 350
                    milkInMachine -= 75
                    coffeeBeansInMachine -= 20
                    moneyInMachine += 7
                    disposableCupsInMachine -= 1
                }
                3 -> {
                    waterInMachine -= 200
                    milkInMachine -= 100
                    coffeeBeansInMachine -= 12
                    moneyInMachine += 6
                    disposableCupsInMachine -= 1
                }
            }
        }
        "fill" -> {
            print("Write how many ml of water do you want to add: > ")
            waterInMachine += scanner.nextInt()
            print("Write how many ml of milk do you want to add: > ")
            milkInMachine += scanner.nextInt()
            print("Write how many grams of coffee beans do you want to add: > ")
            coffeeBeansInMachine += scanner.nextInt()
            print("Write how many disposable cups of coffee do you want to add: >")
            disposableCupsInMachine += scanner.nextInt()
        }
        "take" -> {
            println("I gave you $$moneyInMachine")
            moneyInMachine = 0
        }
    }

    Struggles.machineState(
        waterInMachine,
        milkInMachine,
        coffeeBeansInMachine,
        disposableCupsInMachine,
        moneyInMachine
    )

}