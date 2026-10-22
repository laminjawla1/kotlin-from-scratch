# First and Last

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 3, Exercise 12

## Problem
Ask the user for a series of names, in no particular order. After the last
name is entered, display the name that comes first alphabetically and the
name that comes last.

## Sample run
```
How many names? 5
Enter a name: Lamin
Enter a name: Mariama
Enter a name: Abdou
Enter a name: Kumba
Enter a name: Aisha
FIRST: Abdou
LAST: Mariama
```

```
How many names? 3
Enter a name: zeb
Enter a name: Adam
Enter a name: beth
FIRST: Adam
LAST: zeb
```

## Concepts practiced
- Safe number parsing with `toIntOrNull()`
- `for` loop over a range
- Nullable types (`String?`) to mean "nothing yet"
- Comparing strings alphabetically, ignoring case
- Smart casts after a null check

## Notes
- The exercise doesn't say how the series ends, so this version asks for
  the number of names first.
- Comparison ignores upper and lower case.