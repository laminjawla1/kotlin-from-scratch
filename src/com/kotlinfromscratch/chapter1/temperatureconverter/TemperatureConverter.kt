package com.kotlinfromscratch.chapter1.temperatureconverter

/**
 * Asks the user for temperature in Celsius and convert it into Fahrenheit
 */
fun main() {
    print("Enter Temperature in Celsius: ")
    val celsius = readln().toDoubleOrNull()

    if (celsius == null) {
        println("ERROR: Invalid input. Please enter a valid temperature in Celsius.")
        return
    }

    val fahrenheit = (9.0 / 5.0) * celsius + 32

    println("FAHRENHEIT: %.4f".format(fahrenheit))
}