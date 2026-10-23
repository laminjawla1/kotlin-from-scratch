package com.kotlinfromscratch.chapter6.rockpaperscissors

private const val ROCK = "rock"
private const val PAPER = "paper"
private const val SCISSORS = "scissors"

private val MOVES = listOf(ROCK, PAPER, SCISSORS)

/**
 * Simulates the Rock, Paper, Scissors game
 */
fun main() {
    while (true) {
        val computer = MOVES.random()

        print("1. Rock 2. Paper 3. Scissors: ")
        val input = readln().toIntOrNull()

        if (input == null || input !in 1..3) {
            println("ERROR: Invalid input. Please enter a number within the range of 1 to 3.")
            continue
        }

        val user = MOVES[input - 1]

        println("COMPUTER: $computer")
        println("USER: $user")

        if (user == computer) {
            println("It's a tie! Play again.")
            continue
        }

        val userWins = (user == ROCK && computer == SCISSORS) ||
                (user == SCISSORS && computer == PAPER) ||
                (user == PAPER && computer == ROCK)

        println(if (userWins) "You win!" else "Computer wins!")

        print("Press y to play again or any other key to quit: ")
        if (readln().trim().lowercase() != "y") break
    }

    println("Thanks for playing!")
}