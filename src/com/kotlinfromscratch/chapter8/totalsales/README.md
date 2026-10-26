# Total Sales

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 1

## Problem
Ask the user for a store's sales on each day of the week and store them in
a list. Then display the total and the average sales for the week.

## Sample run
```
Enter Total MONDAY Sales: 100
Enter Total TUESDAY Sales: 600
Enter Total WEDNESDAY Sales: 300
Enter Total THURSDAY Sales: 800
Enter Total FRIDAY Sales: 1400
Enter Total SATURDAY Sales: 700
Enter Total SUNDAY Sales: 0
TOTAL SALES: 3900.00
AVERAGE SALES: 557.14
```

## Concepts practiced
- `mutableListOf<Double>()` and `add`
- `while` loop that only advances on valid input
- `DayOfWeek` from `java.time`
- `sum()` and `average()` on a list
- Safe number parsing with `toDoubleOrNull()`

## Notes
- Uses the built-in `sum()` and `average()` instead of a manual loop.
- Zero is accepted, for a day with no sales.