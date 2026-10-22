# Tuition Increase

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 8

## Problem
Semester tuition is 6,000 and will rise by 2 percent each year for the next
five years. Use a loop to display the projected semester tuition for each
of those years.

## Sample run
```
YEAR 1: SEMESTER FEE = 6120.00
YEAR 2: SEMESTER FEE = 6242.40
YEAR 3: SEMESTER FEE = 6367.25
YEAR 4: SEMESTER FEE = 6494.59
YEAR 5: SEMESTER FEE = 6624.48
```

## Concepts practiced
- Constants with `const val`
- `for` loop over a range
- `var` as a running value that changes each iteration
- Percentage increase and compounding
- String formatting

## Notes
- Year 1 already includes the first 2 percent increase.
- Values are rounded only when printed, so rounding errors don't build up.