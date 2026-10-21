package com.kotlinfromscratch.chapter2.romannumerals

/**
 * Asks for a number from 1 to 10 and displays its Roman numeral.
 */
fun main() {
    print("Enter a number: ")
    val number = readln().toIntOrNull()

    if (number == null || number !in 1..10) {
        println("ERROR: Invalid input. Please enter a number between 1 - 10.")
        return
    }

    val result = when (number) {
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        10 -> "X"
        else -> error("Unexpected number $number")
    }

    println("RESULT: $result")
}