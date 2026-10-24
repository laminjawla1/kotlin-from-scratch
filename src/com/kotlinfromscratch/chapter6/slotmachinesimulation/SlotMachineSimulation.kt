package com.kotlinfromscratch.chapter6.slotmachinesimulation

private val WORDS = listOf("Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars")

/**
 * Asks for a bet, spins three random words, and displays the winnings.
 * Two matching words pay double the bet, three pay triple.
 */
fun main() {
    while (true) {
        print("How much are you betting? ")
        val bet = readln().trim().toDoubleOrNull()

        if (bet == null || bet <= 0) {
            println("ERROR: Invalid input. Please enter a positive number.")
            continue
        }

        val words = List(3) { WORDS.random() }
        println("SLOT: $words")

        val multiplier = when (words.toSet().size) {
            1 -> 3
            2 -> 2
            else -> 0
        }

        println("You have won $%.2f".format(bet * multiplier))

        print("Press y to roll again or any other key to quit: ")
        if (readln().trim().lowercase() != "y") break
    }
}