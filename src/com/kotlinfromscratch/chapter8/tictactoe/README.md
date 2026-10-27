# Tic-Tac-Toe Game

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 8

## Problem
Let two players play Tic-Tac-Toe on a 3×3 board stored as a list of lists,
with every cell starting as an asterisk. Players take turns entering a row
and column for their mark (X for player 1, O for player 2). After each move,
check for three in a row, column or diagonal, or a full board with no winner,
and announce the result.

## Sample run
```
* * *
* * *
* * *

Player 1: 
Row: 1
Col: 1
X * *
* * *
* * *

Player 2: 
Row: 1
Col: 2
X O *
* * *
* * *

Player 1: 
Row: 2
Col: 1
X O *
X * *
* * *

Player 2: 
Row: 22
Col: 2
Invalid move.
Row: 2
Col: 2
X O *
X O *
* * *

Player 1: 
Row: 3
Col: 1
X O *
X O *
X * *

Player 1 wins!
Press y to play again or any other key to quit: 
```

## Concepts practiced
- Nested lists (`MutableList<MutableList<Char>>`) as a 2D board
- Functions with parameters and return values, including `Pair` and destructuring
- `any` and `all` on collections
- Re-prompting until input is valid
- `do` / `while` loop for "play again"

## Notes
- A win or a tie ends the round, and the players can then start a new game.