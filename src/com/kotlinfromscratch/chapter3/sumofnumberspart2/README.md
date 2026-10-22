# Sum of Numbers, Part 2

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 4

## Problem
Ask the user for a limit, then calculate the sum of the cubes of all even
numbers from 1 up to that limit. For a limit of 20, that is
2³ + 4³ + ... + 20³.

## Sample run
```
Enter a number: 20
SUM OF CUBES OF EVEN NUMBERS FROM 1 TO 20: 24200
```

```
Enter a number: 1
SUM OF CUBES OF EVEN NUMBERS FROM 1 TO 1: 0
```

```
Enter a number: -1
ERROR: Invalid input. Please enter a whole number greater than zero.
```

## Concepts practiced
- Safe number parsing with `toIntOrNull()`
- `for` loop with `step`
- `var` as an accumulator, using `Long` to avoid overflow
- Converting with `toLong()`
- Error handling

## Notes
- The exercise suggests a `while` loop. This uses `for` with `step 2`, which
  visits only the even numbers and needs no `if`.
- Uses `Long` for the sum so large limits don't overflow silently.