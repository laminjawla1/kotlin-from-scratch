# Create a Mixed String

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 4, Exercise 4

## Problem
Ask the user for three strings. Build a new string by taking the first
character of each string, then the second character of each, and so on,
stopping when the shortest string runs out of characters.

## Sample run
```
Enter string 1: Hello
Enter string 2: World
Enter string 3: Bye!
NEW STRING: HWBeoylrell!
```

```
Enter string 1: a
Enter string 2: bcd
Enter string 3: efgh
NEW STRING: abe
```

## Concepts practiced
- Reading console input as text
- Finding the smallest of several values with `minOf`
- `for` loop over a range with `..<`
- Indexing a string with `text[i]`
- Building text with `StringBuilder`

## Notes
- Characters beyond the shortest string's length are ignored.
- If any string is empty, the result is empty.