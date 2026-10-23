# Difference Between Max and Min

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 5, Exercise 1

## Problem
Let the user build a list of numbers, typing 'q' when finished. Then
display the smallest number, the largest number, and the difference
between them.

## Sample run
```
Enter a number (type 'q' to stop): 4
Enter a number (type 'q' to stop): 65
Enter a number (type 'q' to stop): 34
Enter a number (type 'q' to stop): 98
Enter a number (type 'q' to stop): 32
Enter a number (type 'q' to stop): q
SMALLEST: 4
LARGEST: 98
DIFFERENCE: 94
```

```
Enter a number (type 'q' to stop): q
No numbers were entered.
```

## Concepts practiced
- `mutableListOf<Int>()` and `add`
- `while (true)` loop with `break` and `continue`
- Safe number parsing with `toIntOrNull()`
- `min()` and `max()` on a list
- Checking for an empty list with `isEmpty()`
- Error handling

## Notes
- A list with one number has a difference of 0.
- `min()` and `max()` throw on an empty list, so the list is checked first.