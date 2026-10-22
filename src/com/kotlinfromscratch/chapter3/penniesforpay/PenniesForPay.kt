package com.kotlinfromscratch.chapter3.penniesforpay

private const val MAX_DAYS = 62

/**
 * Asks for a number of days and displays the total pay if the first day pays
 * one penny and the pay doubles every day.
 */
fun main() {
    print("Enter number of days: ")
    val days = readln().toIntOrNull()

    if (days == null || days !in 1..MAX_DAYS) {
        println("ERROR: Invalid input. Please enter a whole number from 1 to $MAX_DAYS.")
        return
    }

    var dailyPay = 1L
    var totalPennies = 0L

    for (day in 1..days) {
        totalPennies += dailyPay
        dailyPay *= 2
    }

    println("TOTAL PAY AFTER $days DAYS: $%,d.%02d".format(totalPennies / 100, totalPennies % 100))
}