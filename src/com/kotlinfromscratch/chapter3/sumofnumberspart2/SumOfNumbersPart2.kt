package com.kotlinfromscratch.chapter3.sumofnumberspart2

/**
 * Asks the user to enter a number and sums the cubes of even numbers from 1 to the number
 */
fun main() {
    print("Enter a number: ")
    val number = readln().toIntOrNull()

    if (number == null || number <= 0) {
        println("ERROR: Invalid input. Please enter a number greater than zero.")
        return
    }

    var sum = 0L
    for (i in 2..number step 2) {
        sum += i.toLong() * i * i
    }

    println("SUM OF CUBES OF EVEN NUMBERS FROM 1 to $number: $sum")
}