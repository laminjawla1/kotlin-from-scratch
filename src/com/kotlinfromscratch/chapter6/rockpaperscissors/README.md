# Rock, Paper, Scissors Game

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 6, Exercise 1

## Problem
Let the user play Rock, Paper, Scissors against the computer. The computer
picks a move at random without showing it. After the user chooses, display
both moves and announce the winner: rock beats scissors, scissors beats
paper, and paper beats rock. If both pick the same move, play again.

## Sample run
```
1. Rock 2. Paper 3. Scissors: 3
COMPUTER: rock
USER: scissors
Computer wins!
Press y to play again or any other key to quit: y
1. Rock 2. Paper 3. Scissors: 1
COMPUTER: rock
USER: rock
It's a tie! Play again.
1. Rock 2. Paper 3. Scissors: 2
COMPUTER: rock
USER: paper
You win!
Press y to play again or any other key to quit: n
Thanks for playing!
```

## Concepts practiced
- Constants with `const val` and a `listOf()` of moves
- Picking a random element with `random()`
- `while (true)` loop with `break` and `continue`
- Converting a menu number to a list element with `MOVES[input - 1]`
- Decisions with `when` (or boolean conditions)
- Safe number parsing with `toIntOrNull()`

## Notes
- The user picks from a numbered menu instead of typing the move's name.
- A tie replays the round immediately, without asking to play again.