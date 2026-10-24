package com.kotlinfromscratch.chapter7.kilometerconverter

private const val MILES_PER_KILOMETER = 0.6214

/**
 * Asks for a distance in kilometers and displays it in miles.
 */
fun main() {
    print("Distance in kilometers: ")
    val distanceInKm = readln().trim().toDoubleOrNull()

    if (distanceInKm == null || distanceInKm < 0) {
        println("ERROR: Invalid input. Please enter a positive number.")
        return
    }

    val distanceInMiles = convertKilometersToMiles(distanceInKm)

    println("%.4f miles".format(distanceInMiles))
}

private fun convertKilometersToMiles(kilometers: Double): Double = kilometers * MILES_PER_KILOMETER