# Largest and Smallest

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 11

## Problem
Use a loop to read a series of numbers, where -99 ends the series. Then
display the smallest and largest numbers entered.

## Sample run
```
Enter a number (-99 to stop): 4
Enter a number (-99 to stop): -7
Enter a number (-99 to stop): 12
Enter a number (-99 to stop): -99
SMALLEST: -7
LARGEST: 12
```

```
Enter a number (-99 to stop): -99
No numbers were entered.
```

## Concepts practiced
- `while (true)` loop with `break` and `continue`
- Safe number parsing with `toIntOrNull()`
- Nullable types (`Int?`) to mean "no value yet"
- Smart casts after a null check
- Error handling

## Notes
- -99 is the stop signal, so it can't be entered as a data value.