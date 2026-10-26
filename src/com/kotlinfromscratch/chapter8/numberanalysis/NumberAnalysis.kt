package com.kotlinfromscratch.chapter8.numberanalysis

private const val TOTAL_NUMBERS = 20

/**
 * Asks for 20 numbers, then displays the lowest, highest, total and average.
 */
fun main() {
    val numbers = mutableListOf<Double>()

    var i = 1
    while (i <= TOTAL_NUMBERS) {
        print("Enter #$i: ")
        val number = readln().trim().toDoubleOrNull()

        if (number == null || !number.isFinite()) {
            println("ERROR: Invalid input. Please enter a valid number.")
            continue
        }

        numbers.add(number)

        i++
    }

    val lowest = numbers.min()
    val highest = numbers.max()
    val total = numbers.sum()
    val average = numbers.average()

    println("LOWEST: $lowest")
    println("HIGHEST: $highest")
    println("TOTAL: %.1f".format(total))
    println("AVERAGE: %.1f".format(average))
}