# Test Average and Grade

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 7, Exercise 9

## Problem
Ask the user for five test scores. Display a letter grade for each score
and the average of all five. Write one function, `calcAverage`, that returns
the average, and another, `determineGrade`, that turns a score into a
letter: A for 90 and above, B for 80 to 89, C for 70 to 79, D for 60 to 69,
and F below 60.

## Sample run
```
Enter score #1: 76
Enter score #2: 89.5
Enter score #3: 76
Enter score #4: 45
Enter score #5: 88
SCORE: 76.0 | GRADE: C
SCORE: 89.5 | GRADE: B
SCORE: 76.0 | GRADE: C
SCORE: 45.0 | GRADE: F
SCORE: 88.0 | GRADE: B
AVERAGE: 74.9
```

## Concepts practiced
- Writing functions with parameters and return values
- `mutableListOf<Double>()` and `average()`
- `when` without an argument, with lower-bound checks
- `while` loop that only advances on valid input
- Safe number parsing with `toDoubleOrNull()`

## Notes
- Scores can have decimals, and grade boundaries have no gaps.