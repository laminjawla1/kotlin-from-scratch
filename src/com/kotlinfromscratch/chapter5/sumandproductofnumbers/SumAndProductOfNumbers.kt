package com.kotlinfromscratch.chapter5.sumandproductofnumbers

/**
 * Asks the user for a list of numbers and finds the sum and product of numbers with odd indices.
 */
fun main() {
    val numbers = mutableListOf<Int>()

    while (true) {
        print("Enter a number (type 'q' to stop): ")
        val input = readln().trim().lowercase()

        if (input == "q") break

        val number = input.toIntOrNull()
        if (number == null) {
            println("ERROR: Invalid input. Please enter an integer.")
            continue
        }

        numbers.add(number)
    }

    if (numbers.size < 2) {
        println("Need at least two numbers to have an odd index.")
    } else {
        var sum = 0L
        var product = 1L

        for (i in 1..<numbers.size step 2) {
            sum += numbers[i]
            product *= numbers[i]
        }

        println("SUM: $sum")
        println("PRODUCT: $product")
    }

}