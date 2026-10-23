# Convert a List of Characters to a String

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 5, Exercise 4

## Problem
Let the user build a list of single characters, typing 'q' when finished.
Then convert the list into a single string and display it.

## Sample run
```
Enter a character (type 'q' to stop): H
Enter a character (type 'q' to stop): e
Enter a character (type 'q' to stop): l
Enter a character (type 'q' to stop): l
Enter a character (type 'q' to stop): df
ERROR: Invalid input. Please enter a single character.
Enter a character (type 'q' to stop):
ERROR: Invalid input. Please enter a single character.
Enter a character (type 'q' to stop): o
Enter a character (type 'q' to stop): q
STRING: Hello
```

## Concepts practiced
- `mutableListOf<Char>()` and `add`
- Indexing a string with `input[0]`
- Joining a list into a string with `joinToString("")`
- `while (true)` loop with `break` and `continue`
- Input validation

## Notes
- 'q' (or 'Q') ends the list, so it can't be entered as a character.
- A single space counts as a character.