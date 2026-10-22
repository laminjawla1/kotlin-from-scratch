# Count Digits in a String

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 4, Exercise 1

## Problem
Ask the user for a string and display how many digit characters it contains.

## Sample run
```
Enter a string: asdf4356jjg1
Digits: 5
```

```
Enter a string: hello
Digits: 0
```

## Concepts practiced
- Reading console input as text
- `count` with a lambda
- `Char.isDigit()`
- Implicit lambda parameter `it`

## Notes
- Counts how many digits there are, not the sum of their values.
- `isDigit()` also accepts digits from other scripts, not only 0 to 9.