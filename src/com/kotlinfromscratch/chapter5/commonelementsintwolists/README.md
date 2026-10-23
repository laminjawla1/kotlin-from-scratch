# Common Elements in Two Lists

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 5, Exercise 2

## Problem
Let the user enter two lists of numbers, each of any size, typing 'q' to
finish each one. Then display the elements that appear in both lists.

## Sample run
```
Populate the first list:
Enter a number (type 'q' to stop): 1
Enter a number (type 'q' to stop): 3
Enter a number (type 'q' to stop): 2
Enter a number (type 'q' to stop): 4
Enter a number (type 'q' to stop): q
Populate the second list:
Enter a number (type 'q' to stop): 1
Enter a number (type 'q' to stop): 4
Enter a number (type 'q' to stop): 8
Enter a number (type 'q' to stop): 9
Enter a number (type 'q' to stop): 10q
ERROR: Invalid input. Please enter an integer.
Enter a number (type 'q' to stop): 10
Enter a number (type 'q' to stop): q
COMMON ITEMS: [1, 4]
```

```
Populate the first list:
Enter a number (type 'q' to stop): 1
Enter a number (type 'q' to stop): q
Populate the second list:
Enter a number (type 'q' to stop): 2
Enter a number (type 'q' to stop): q
COMMON ITEMS: []
```

## Concepts practiced
- Extracting repeated logic into a function with a parameter and a return value
- `mutableSetOf<Int>()` and `add`
- `intersect` on sets
- `while (true)` loop with `break` and `continue`
- Safe number parsing with `toIntOrNull()`

## Notes
- Lists are stored as sets, so repeated numbers count once.
- The result keeps the order of the first list.