package com.kotlinfromscratch.chapter3.totalseries

/**
 * Asks for a positive whole number n and prints the series 1/n + 2/(n-1) + ... + n/1 with its total.
 */
fun main() {
    print("Enter a number: ")
    val n = readln().toIntOrNull()

    if (n == null || n < 1) {
        println("ERROR: Invalid input. Please enter a valid number.")
        return
    }

    var sum = 0.0

    for (i in 1..n) {
        val denominator = n - i + 1
        print("$i/$denominator")
        if (i < n) print(" + ")
        sum += i.toDouble() / denominator
    }

    println(" = %.4f".format(sum))
}