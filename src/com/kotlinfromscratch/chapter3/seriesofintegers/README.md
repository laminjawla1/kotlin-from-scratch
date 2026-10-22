# Series of Integers

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 9

## Problem
Ask the user how many integers will follow, read that many integers, and
display their sum and average. The count itself is not included in the
sum or average.

## Sample run
```
How many integers? 5
Enter an integer: 1
Enter an integer: 2
Enter an integer: 3
Enter an integer: 4
Enter an integer: 5
SUM: 15
AVERAGE: 3.0000
```

```
How many integers? 3
Enter an integer: -4
Enter an integer: abc
ERROR: Invalid input. Please enter an integer.
Enter an integer: 10
Enter an integer: 3
SUM: 9
AVERAGE: 3.0000
```

## Concepts practiced
- Safe number parsing with `toIntOrNull()`
- `while` loop with a counter
- Re-prompting with `continue`
- Converting with `toDouble()` to avoid integer division
- Error handling

## Notes
- Invalid entries don't count toward the total, so the program keeps asking
  until it has the requested number of valid integers.