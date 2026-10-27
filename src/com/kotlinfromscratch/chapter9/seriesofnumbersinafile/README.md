# Series of Numbers in a File

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 9, Exercise 1

## Problem
Read a series of integers from a file named `numbers.dat` and display the
list of numbers, their sum, their average, and the largest and smallest.

## Sample run
```
NUMBERS: [525, 570, 295, 13, 971, 679, 774, 475, 626, 345, 690, 146, 911, 994, 394, 2, 150, 229, 951, 920, 18, 601, 386, 990, 895, 622, 665, 167, 93, 66, 55, 707, 759, 277, 186, 252, 716, 181, 312, 468, 834, 139, 851, 523, 491, 455, 646, 132, 953, 361]
SUM: 24461
AVERAGE: 489.2
LARGEST: 994
SMALLEST: 2
```

## Concepts practiced
- Reading a file with `File.readLines()`
- Writing a file with `File.writeText()`
- Checking that a file exists with `exists()`
- `filter` and `map` on a list
- `sum()`, `average()`, `min()` and `max()`

## Notes
- If `numbers.dat` doesn't exist, the program creates it with 50 random
  numbers between 0 and 1000, so the output differs on a fresh file.
- The file is created in the directory the program runs from.
- Blank lines in the file are ignored, and an empty file prints a message.