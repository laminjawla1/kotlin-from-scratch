# Sum of Numbers, Part 1

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 3

## Problem
Use a loop to ask the user for a series of positive numbers. A negative
number ends the series. Then display the sum of the numbers entered.

## Sample run
```
Enter a number (negative number to stop): 1
Enter a number (negative number to stop): 2
Enter a number (negative number to stop): 3
Enter a number (negative number to stop): 4
Enter a number (negative number to stop): 5
Enter a number (negative number to stop): -1
SUM: 15
```

```
Enter a number (negative number to stop): -1
SUM: 0
```

## Concepts practiced
- `while (true)` loop with `break`
- Skipping to the next iteration with `continue`
- `var` as an accumulator
- Safe number parsing with `toIntOrNull()`
- Error handling