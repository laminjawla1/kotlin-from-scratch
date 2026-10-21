package com.kotlinfromscratch.chapter1.areaofacircle

import kotlin.math.PI

/**
 * Ask for a radius and calculates the area of a circle
 */
fun main() {
    print("Enter Radius: ")
    val radius = readln().toDoubleOrNull()

    if (radius == null || radius <= 0) {
        println("ERROR: Invalid input. Please enter a valid radius.")
        return
    }

    val area = PI * radius * radius

    println("AREA: %.4f".format(area))
}