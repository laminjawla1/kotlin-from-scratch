package com.kotlinfromscratch.chapter9.seriesofnumbersinafile

import java.io.File

private const val FILE_NAME = "numbers.dat"
private const val NUMBER_COUNT = 50
private const val MAX_NUMBER = 1000

/**
 * Creates numbers.dat with random numbers if it doesn't exist, then reads it
 * and displays the numbers, their sum, average, largest and smallest.
 */
fun main() {
    val file = File(FILE_NAME)
    if (!file.exists()) seed(file)

    val numbers = file.readLines()
        .filter { it.isNotBlank() }
        .map { it.trim().toInt() }

    if (numbers.isEmpty()) {
        println("The file contains no numbers.")
        return
    }

    println("NUMBERS: $numbers")
    println("SUM: ${numbers.sum()}")
    println("AVERAGE: %.1f".format(numbers.average()))
    println("LARGEST: ${numbers.max()}")
    println("SMALLEST: ${numbers.min()}")
}

private fun seed(file: File) {
    val numbers = List(NUMBER_COUNT) { (0..MAX_NUMBER).random() }
    file.writeText(numbers.joinToString("\n", postfix = "\n"))
}