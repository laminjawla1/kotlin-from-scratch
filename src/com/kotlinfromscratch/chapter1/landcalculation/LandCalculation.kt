package com.kotlinfromscratch.chapter1.landcalculation

/**
 * Ask the user for total square meters and calculate the number of hectares
 */
fun main() {
    print("Enter Total Square Meters: ")
    val totalSquareMeters = readln().toDoubleOrNull()

    if (totalSquareMeters == null || totalSquareMeters < 0) {
        println("ERROR: Invalid input. Please enter a non-negative number.")
        return
    }

    val hectares = totalSquareMeters / 10_000

    println("Hectares: %.4f".format(hectares))
}