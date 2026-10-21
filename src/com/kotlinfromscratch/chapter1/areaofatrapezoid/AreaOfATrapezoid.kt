package com.kotlinfromscratch.chapter1.areaofatrapezoid

/**
 * Asks for the two bases and the height of a trapezoid, then calculates its area.
 */
fun main() {
    print("Base 1: ")
    val base1 = readln().toDoubleOrNull()

    print("Base 2: ")
    val base2 = readln().toDoubleOrNull()

    print("Height: ")
    val height = readln().toDoubleOrNull()

    if (base1 == null || base1 <= 0 || base2 == null || base2 <= 0 || height == null || height <= 0) {
        println("ERROR: Invalid input. Please enter a valid trapezoid bases and height.")
        return
    }

    val area = 0.5 * (base1 + base2) * height

    println("AREA: %.2f".format(area))
}