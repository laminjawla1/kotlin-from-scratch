# Number Analysis Program

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 3

## Problem
Ask the user for 20 numbers and store them in a list. Then display the
lowest number, the highest number, the total and the average.

## Sample run
```
Enter #1: 45
Enter #2: 65
Enter #3: 78
Enter #4: 43
Enter #5: 23
Enter #6: 90
Enter #7: 87
Enter #8: 56
Enter #9: 76
Enter #10: 45
Enter #11: 34
Enter #12: 98
Enter #13: 77
Enter #14: 80
Enter #15: 123
Enter #16: 321
Enter #17: 456
Enter #18: 76
Enter #19: 876
Enter #20: 433
LOWEST: 23.0
HIGHEST: 876.0
TOTAL: 3182.0
AVERAGE: 159.1
```

## Concepts practiced
- `mutableListOf<Double>()` and `add`
- `while` loop that only advances on valid input
- `min()`, `max()`, `sum()` and `average()` on a list
- Rejecting `NaN` and infinity with `isFinite()`
- Safe number parsing with `toDoubleOrNull()`

## Notes
- Zero and negative numbers are valid entries.