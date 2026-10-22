package com.kotlinfromscratch.chapter3.sumofnumberspart1

/**
 * Repeatedly asks for whole numbers and adds them up until a negative number is entered, then prints the sum.
 */
fun main() {
    var sum = 0
    while (true) {
        print("Enter a number (negative number to stop): ")
        val number = readln().toIntOrNull()

        if (number == null) {
            println("ERROR: Invalid input. Please enter a whole number.")
            continue
        }

        if (number < 0) break

        sum += number
    }

    println("SUM: $sum")
}