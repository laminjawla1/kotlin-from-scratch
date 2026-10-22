# Pennies for Pay

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 10

## Problem
A person earns one penny on the first day, two on the second, and the pay
doubles every day. Ask the user for a number of days and display the total
pay for that period in dollars, not pennies.

## Sample run
```
Enter number of days: 30
TOTAL PAY AFTER 30 DAYS: $10,737,418.23
```

```
Enter number of days: 10
TOTAL PAY AFTER 10 DAYS: $10.23
```

## Concepts practiced
- Safe number parsing with `toIntOrNull()`
- Range checks with `!in`
- `for` loop over a range
- `Long` to avoid overflow
- Integer division and remainder (`/`, `%`) for exact dollars and cents
- Formatting numbers with `%,d` and `%02d`

## Notes
- Total pay is the sum of every day's pay, which equals 2^days - 1 pennies.
- Limited to 62 days so the total fits in a `Long`.