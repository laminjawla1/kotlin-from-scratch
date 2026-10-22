package com.kotlinfromscratch.chapter4.removenonalphabetcharacters

/**
 * Asks for a string and remove non-alphabet characters
 */
fun main() {
    print("Enter a string: ")
    val text = readln()

    val cleaned = text.filter { it.isLetter() }
    println("CLEANED: $cleaned")
}