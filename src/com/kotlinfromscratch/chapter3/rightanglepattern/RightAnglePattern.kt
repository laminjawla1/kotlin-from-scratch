package com.kotlinfromscratch.chapter3.rightanglepattern

/**
 * Asks for a height and prints a right triangle where each row repeats its row number.
 */
fun main() {
    print("Height: ")
    val height = readln().toIntOrNull()

    if (height == null || height <= 0) {
        println("ERROR: Invalid input. Please enter a whole number greater than zero.")
        return
    }

    for (i in 1 .. height) {
        println(i.toString().repeat(i))
    }
}