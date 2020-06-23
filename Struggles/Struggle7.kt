package Struggles

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var accountMoney = scanner.nextInt()

    while (scanner.hasNextInt()) {
        val compra = scanner.nextInt()
        if (compra > accountMoney) {
            println("Error, insufficient funds for the purchase. You have $accountMoney, but you need $compra.")
            return
        } else accountMoney -= compra
    }

    println("Thank you for choosing us to manage your account! You have $accountMoney money.")
}