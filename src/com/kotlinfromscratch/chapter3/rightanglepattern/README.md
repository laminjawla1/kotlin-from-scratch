# Right Triangle Pattern

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 5

## Problem
Ask the user for a height and print a right triangle made of numbers.
Row n contains the digit n repeated n times.

## Sample run
```
Height: 5
1
22
333
4444
55555
```

```
Height: 0
ERROR: Invalid input. Please enter a whole number greater than zero.
```

## Concepts practiced
- Safe number parsing with `toIntOrNull()`
- `for` loop over a range
- Building a row with `String.repeat()`
- Converting a number to text with `toString()`
- Error handling

## Notes
- From height 10 upward, the row number has two digits, so rows no longer
  grow by one character at a time.