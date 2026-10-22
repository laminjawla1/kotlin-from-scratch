# Remove Non-Alphabet Characters

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 4, Exercise 3

## Problem
Ask the user for a string and display it with all non-alphabet characters
(digits, symbols and spaces) removed.

## Sample run
```
Enter a string: f5676io434
CLEANED: fio
```

```
Enter a string: Hello, World! 123
CLEANED: HelloWorld
```

## Concepts practiced
- Reading console input as text
- `filter` with a lambda
- `Char.isLetter()`
- Implicit lambda parameter `it`

## Notes
- Spaces are removed too, since they are not letters.
- `isLetter()` also accepts accented letters and letters from other scripts.