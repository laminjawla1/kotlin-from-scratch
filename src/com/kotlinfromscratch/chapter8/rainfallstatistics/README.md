# Rainfall Statistics

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 2

## Problem
Let the user enter the total rainfall for each of the 12 months. Display the
total rainfall for the year, the average monthly rainfall, and the months
with the highest and lowest rainfall.

## Sample run
```
Enter Total JANUARY Rainfall: 1
Enter Total FEBRUARY Rainfall: 2
Enter Total MARCH Rainfall: 3
Enter Total APRIL Rainfall: 4
Enter Total MAY Rainfall: 5
Enter Total JUNE Rainfall: 6
Enter Total JULY Rainfall: 7
Enter Total AUGUST Rainfall: 8
Enter Total SEPTEMBER Rainfall: 9
Enter Total OCTOBER Rainfall: 10
Enter Total NOVEMBER Rainfall: 11
Enter Total DECEMBER Rainfall: 12
TOTAL RAINFALL: 78.00
AVERAGE RAINFALL: 6.50
HIGHEST -> DECEMBER | 12.0
LOWEST -> JANUARY | 1.0
```

## Concepts practiced
- `mutableMapOf<Month, Double>()` and storing values by key
- `Month` from `java.time`
- `maxBy` and `minBy` on a map
- `sum()` and `average()` on map values
- `while` loop that only advances on valid input

## Notes
- If several months tie for the highest or lowest, only the first is shown.