# Sum and Product of Numbers at Odd Indices

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 5, Exercise 3

## Problem
Let the user build a list of numbers, typing 'q' when finished. Then
display the sum and the product of the numbers at odd indices (the 2nd,
4th, 6th number and so on).

## Sample run
```
Enter a number (type 'q' to stop): 1
Enter a number (type 'q' to stop): 2
Enter a number (type 'q' to stop): 3
Enter a number (type 'q' to stop): 4
Enter a number (type 'q' to stop): q
SUM: 6
PRODUCT: 8
```

```
Enter a number (type 'q' to stop): 7
Enter a number (type 'q' to stop): q
Need at least two numbers to have an odd index.
```

## Concepts practiced
- `mutableListOf<Int>()` and `add`
- Indexing a list with `numbers[i]`
- `for` loop with `step` over part of a range
- `Long` accumulators to avoid overflow
- Safe number parsing with `toIntOrNull()`

## Notes
- Indices start at 0, so odd indices are the 2nd, 4th, 6th number and so on.
- With fewer than two numbers there are no odd indices, so no result is shown.