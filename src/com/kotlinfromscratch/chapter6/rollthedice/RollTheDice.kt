package com.kotlinfromscratch.chapter6.rollthedice

/**
 * Rolls three dice, prints a message based on the result, and asks whether to roll again.
 */
fun main() {
    while (true) {
        val rolls = List(3) { (1..6).random() }
        println("Rolls: $rolls")

        val isTriple = rolls.toSet().size == 1
        val sorted = rolls.sorted()
        val isSequence = sorted[1] == sorted[0] + 1 && sorted[2] == sorted[1] + 1

        when {
            isTriple && rolls[0] == 6 -> println("Best hand, triple 6.")
            isTriple -> println("Pretty good, triple ${rolls[0]}.")
            isSequence -> println("Nice.")
            else -> println("Too bad.")
        }

        print("Press y to roll again or any other key to quit: ")
        if (readln().trim().lowercase() != "y") break
    }
}