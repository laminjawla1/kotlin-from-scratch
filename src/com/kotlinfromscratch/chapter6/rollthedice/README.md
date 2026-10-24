# Roll the Dice

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 6, Exercise 3

## Problem
Roll three dice and print a message based on the result: "Best hand, triple 6"
for three sixes, "Pretty good, triple x" for any other three of a kind,
"Nice" for a sequence, and "Too bad" otherwise. After each roll, ask the
user whether to roll again.

## Sample run
```
Rolls: [6, 6, 6]
Best hand, triple 6.
Press y to roll again or any other key to quit: y
Rolls: [3, 2, 4]
Nice.
Press y to roll again or any other key to quit: y
Rolls: [2, 4, 4]
Too bad.
Press y to roll again or any other key to quit: n
```

## Concepts practiced
- Generating random numbers with `random()` and building a list with `List(3) { ... }`
- Removing duplicates with `toSet()`
- Sorting with `sorted()`
- `when` without an argument
- `while (true)` loop with `break`

## Notes
- A sequence is three consecutive numbers in any order, such as 2-3-4 or 4-2-3.
- Output is random, so every run differs.