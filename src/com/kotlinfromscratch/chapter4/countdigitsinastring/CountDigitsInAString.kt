package com.kotlinfromscratch.chapter4.countdigitsinastring

/**
 * Asks for a string and counts how many digits it contains.
 */
fun main() {
    print("Enter a string: ")
    val text = readln()
    val digitCount = text.count { it -> it.isDigit() }
    println("Digits: $digitCount")
}