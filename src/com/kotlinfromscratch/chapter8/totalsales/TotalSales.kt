package com.kotlinfromscratch.chapter8.totalsales

import java.time.DayOfWeek

private const val DAYS_IN_WEEK = 7

/**
 * Asks for the sales of each day of the week, then displays the total and the average.
 */
fun main() {
    val weekSales = mutableListOf<Double>()

    var i = 1
    while (i <= DAYS_IN_WEEK) {
        print("Enter Total ${DayOfWeek.of(i)} Sales: ")
        val sales = readln().trim().toDoubleOrNull()

        if (sales == null || sales !in 0.0..Double.MAX_VALUE) {
            println("ERROR: Invalid input. Please enter a valid sales amount.")
            continue
        }

        weekSales.add(sales)
        i++
    }

    println("TOTAL SALES: %.2f".format(weekSales.sum()))
    println("AVERAGE SALES: %.2f".format(weekSales.average()))
}