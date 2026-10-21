package com.kotlinfromscratch.chapter1.swaptwonumbers

/**
 * Asks the user to enter two numbers and swap them
 */
fun main() {
    print("Enter First Number: ")
    var firstNumber = readln().toDoubleOrNull()

    print("Enter Second Number: ")
    var secondNumber = readln().toDoubleOrNull()

    if (firstNumber == null || secondNumber == null) {
        println("ERROR: Invalid input. Please enter valid numbers.")
        return
    }

    println()

    println("Before Swap:")
    println("FIRST NUMBER: %.4f".format(firstNumber))
    println("SECOND NUMBER: %.4f".format(secondNumber))

    val temp = firstNumber
    firstNumber = secondNumber
    secondNumber = temp

    println()

    println("After Swap:")
    println("FIRST NUMBER: %.4f".format(firstNumber))
    println("FIRST SECOND: %.4f".format(secondNumber))
}