# Vowels

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 6

## Problem
Generate 50 random uppercase letters into a list, display them, then display
how many of them are vowels (A, E, I, O, U).

## Sample run
```
RANDOM LETTERS: QBXAEMLZIOKCUUDRPSTNHVJYWFGQBXAEMLZIOKCUUDRPSTNHVJ
VOWEL: A | COUNT: 2
VOWEL: E | COUNT: 2
VOWEL: I | COUNT: 2
VOWEL: O | COUNT: 2
VOWEL: U | COUNT: 4
```

## Concepts practiced
- Building a list with `List(50) { ... }`
- Picking a random letter from a `Char` range (`'A'..'Z'`)
- `count` with a lambda
- `mapOf()` and iterating over a map
- Membership checks with `in`

## Notes
- Output is random, so every run differs.
- Letters come from the range `'A'..'Z'` directly, so the ASCII hint isn't needed.
- Prints a count for each vowel, including zeros.