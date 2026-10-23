package com.kotlinfromscratch.chapter5.differencebetweenmaxandmin

/**
 * Asks the user for a list of numbers and find the difference between the largest and smallest
 */
fun main() {
    val numbers = mutableListOf<Int>()

    while (true) {
        print("Enter a number (type 'q' to stop): ")
        val input = readln()

        if (input.lowercase() == "q") break

        val number = input.toIntOrNull()
        if (number == null) {
            println("ERROR: Invalid input. Please enter an integer.")
            continue
        }

        numbers.add(number)
    }

    if (numbers.isEmpty()) {
        println("No numbers were entered.")
    } else {
        val smallest = numbers.min()
        val largest = numbers.max()
        val difference = largest - smallest

        println("SMALLEST: $smallest")
        println("LARGEST: $largest")
        println("DIFFERENCE: $difference")
    }
}