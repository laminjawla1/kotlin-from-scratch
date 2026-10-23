package com.kotlinfromscratch.chapter5.interchangenumbers

/**
 * Reads an even number of integers into a list and reverses it by swapping the first with the last,
 * the second with the second-to-last, and so on.
 */
fun main() {
    print("How many digits (must be an even number): ")
    val n = readln().toIntOrNull()

    if (n == null || n < 1 || n % 2 != 0) {
        println("ERROR: Invalid input. Please enter a positive even number.")
        return
    }

    val digits = mutableListOf<Int>()

    while (digits.size < n) {
        print("Enter Digit #${digits.size + 1}: ")
        val digit = readln().trim().toIntOrNull()

        if (digit == null) {
            println("ERROR: Invalid input. Please enter an integer.")
            continue
        }

        digits.add(digit)
    }

    var start = 0
    var end = digits.size - 1
    while (start < end) {
        val temp = digits[start]
        digits[start] = digits[end]
        digits[end] = temp

        start++
        end--
    }

    println("RESULT: $digits")
}