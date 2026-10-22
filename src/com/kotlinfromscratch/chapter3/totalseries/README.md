# Total Series

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 1

## Problem
Ask the user for a positive whole number n and calculate the total of the
series 1/n + 2/(n-1) + 3/(n-2) + ... + n/1. For example, for n = 4 the
series is 1/4 + 2/3 + 3/2 + 4/1.

## Sample run
```
Enter a number: 5
1/5 + 2/4 + 3/3 + 4/2 + 5/1 = 8.7000
```

```
Enter a number: 1
1/1 = 1.0000
```

## Concepts practiced
- Safe number parsing with `toIntOrNull()`
- `for` loop over a range
- `var` as an accumulator
- Mixing `Int` and `Double` arithmetic
- Error handling