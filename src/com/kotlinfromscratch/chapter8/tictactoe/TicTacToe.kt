package com.kotlinfromscratch.chapter8.tictactoe

private const val EMPTY = '*'
private const val SIZE = 3

/**
 * Lets two players play Tic-Tac-Toe on the console, with the option to play again.
 */
fun main() {
    do {
        playGame()
        print("Press y to play again or any other key to quit: ")
    } while (readln().trim().lowercase() == "y")
}

private fun playGame() {
    val board = MutableList(SIZE) { MutableList(SIZE) { EMPTY } }
    var player = 'X'

    while (true) {
        printBoard(board)

        val playerNumber = if (player == 'X') 1 else 2
        val (row, col) = getMove(board, "Player $playerNumber: ")
        board[row][col] = player

        if (hasWon(board, player)) {
            printBoard(board)
            println("Player $playerNumber wins!")
            return
        }

        if (board.all { line -> EMPTY !in line }) {
            printBoard(board)
            println("It's a tie!")
            return
        }

        player = if (player == 'X') 'O' else 'X'
    }
}

private fun printBoard(board: List<List<Char>>) {
    for (line in board) println(line.joinToString(" "))
    println()
}

private fun hasWon(board: List<List<Char>>, player: Char): Boolean {
    val inRow = board.any { line -> line.all { it == player } }
    val inColumn = (0..<SIZE).any { c -> board.all { line -> line[c] == player } }
    val onDiagonal = (0..<SIZE).all { board[it][it] == player }
    val onAntiDiagonal = (0..<SIZE).all { board[it][SIZE - 1 - it] == player }
    return inRow || inColumn || onDiagonal || onAntiDiagonal
}

/** Asks until the player picks an empty cell, and returns it as zero-based (row, column). */
private fun getMove(board: List<List<Char>>, prompt: String): Pair<Int, Int> {
    println(prompt)
    while (true) {
        print("Row: ")
        val row = readln().trim().toIntOrNull()

        print("Col: ")
        val col = readln().trim().toIntOrNull()

        if (row != null && col != null && row in 1..SIZE && col in 1..SIZE && board[row - 1][col - 1] == EMPTY) {
            return Pair(row - 1, col - 1)
        }

        println("Invalid move.")
    }
}