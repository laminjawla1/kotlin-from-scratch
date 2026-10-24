# Slot Machine Simulation

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 6, Exercise 4

## Problem
Simulate a slot machine. Ask the user for the amount they want to bet,
then pick three random words from Cherries, Oranges, Plums, Bells, Melons
and Bars. If no words match, the user wins $0. If two match, the user wins
twice the bet. If all three match, the user wins three times the bet.

## Sample run
```
How much are you betting? 50
SLOT: [Oranges, Bells, Oranges]
You have won $100.00
Press y to roll again or any other key to quit: y
How much are you betting? 100
SLOT: [Cherries, Bells, Plums]
You have won $0.00
Press y to roll again or any other key to quit: y
How much are you betting? abc
ERROR: Invalid input. Please enter a positive number.
How much are you betting? 500
SLOT: [Bars, Bars, Bars]
You have won $1500.00
Press y to roll again or any other key to quit: n
```

## Concepts practiced
- `listOf()` of words and picking with `random()`
- Building a list with `List(3) { ... }`
- Counting distinct values with `toSet().size`
- `when` as an expression
- `while (true)` loop with `break` and `continue`
- Safe number parsing with `toDoubleOrNull()`

## Notes
- Output is random, so every run differs.
- The program tracks one bet at a time, not a running balance.