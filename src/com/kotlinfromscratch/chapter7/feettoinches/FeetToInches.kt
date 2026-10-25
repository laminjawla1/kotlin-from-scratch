package com.kotlinfromscratch.chapter7.feettoinches

private const val FOOT_PER_INCHES = 12.0

/**
 * Converts feet to inches
 */
fun main() {
    print("Feet: ")
    val feet = readln().trim().toDoubleOrNull()

    if (feet == null || feet <= 0) {
        println("ERROR: Invalid input. Please enter a positive number.")
        return
    }

    val inches = feetToInches(feet)

    println("INCHES: %.1f".format(inches))
}

fun feetToInches(feet: Double): Double = feet * FOOT_PER_INCHES