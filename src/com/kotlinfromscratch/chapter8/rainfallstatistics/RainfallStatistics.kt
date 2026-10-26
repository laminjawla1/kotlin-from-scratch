package com.kotlinfromscratch.chapter8.rainfallstatistics

import java.time.Month

private const val MONTHS_IN_YEAR = 12

/**
 * Asks for the total rainfall of each month of the year, then displays the total, average and months with highest and lowest.
 */
fun main() {
    val yearlyRainfall = mutableMapOf<Month, Double>()

    var i = 1
    while (i <= MONTHS_IN_YEAR) {
        print("Enter Total ${Month.of(i)} Rainfall: ")
        val rainfall = readln().trim().toDoubleOrNull()

        if (rainfall == null || rainfall !in 0.0..Double.MAX_VALUE) {
            println("ERROR: Invalid input. Please enter a valid rainfall amount.")
            continue
        }

        yearlyRainfall[Month.of(i)] = rainfall
        i++
    }

    val highest = yearlyRainfall.maxBy { it.value }
    val lowest = yearlyRainfall.minBy { it.value }

    println("TOTAL RAINFALL: %.2f".format(yearlyRainfall.values.sum()))
    println("AVERAGE RAINFALL: %.2f".format(yearlyRainfall.values.average()))
    println("HIGHEST -> ${highest.key} | %.1f".format(highest.value))
    println("LOWEST -> ${lowest.key} | %.1f".format(lowest.value))
}