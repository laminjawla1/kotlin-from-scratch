package com.kotlinfromscratch.chapter3.sumofnumberspart1

/**
 * Asks the user to enter a number.
 * If the number negative the program stops reading numbers otherwise it accumulates a sum
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