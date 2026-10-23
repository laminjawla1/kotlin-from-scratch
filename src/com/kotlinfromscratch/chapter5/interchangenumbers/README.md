# Interchange Numbers

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 5, Exercise 5

## Problem
Ask the user for an even number of integers and store them in a list.
Then swap the first with the last, the second with the second-to-last, and
so on, and display the result.

## Sample run
```
How many digits (must be an even number): 6
Enter Digit #1: 1
Enter Digit #2: 2
Enter Digit #3: 3
Enter Digit #4: 4
Enter Digit #5: 5
Enter Digit #6: 6
RESULT: [6, 5, 4, 3, 2, 1]
```

```
How many digits (must be an even number): 2
Enter Digit #1: abc
ERROR: Invalid input. Please enter an integer.
Enter Digit #1: 8
Enter Digit #2: 9
RESULT: [9, 8]
```

## Concepts practiced
- `mutableListOf<Int>()` and `add`
- `while` loop that only advances on valid input
- Indexing and updating a list with `digits[i]`
- Swapping values with a temporary variable
- Two pointers moving toward each other

## Notes
- The list is reversed in place by swapping from both ends.
- Kotlin also has a built-in `reverse()` for mutable lists. This version
  swaps manually to show how it works.