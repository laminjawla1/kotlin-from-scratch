package com.kotlinfromscratch.chapter3.largestandsmallest

/**
 * Asks the user for a series of numbers (-99 to stop) and find the smallest and largest
 */
fun main() {
    var smallest: Int? = null
    var largest: Int? = null

    while (true) {
        print("Enter a number (-99 to stop): ")
        val number = readln().toIntOrNull()

        if (number == null) {
            println("ERROR: Invalid input. Please an integer.")
            continue
        }

        if (number == -99) break

        if (smallest == null || number < smallest) smallest = number
        if (largest == null || number > largest) largest = number
    }

    if (smallest == null) {
        println("No numbers were entered")
    } else {
        println("SMALLEST: $smallest")
        println("LARGEST: $largest")
    }

}