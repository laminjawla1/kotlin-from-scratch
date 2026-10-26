# Charge Account Validation

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 4

## Problem
Ask the user for a charge account number and tell them whether it is valid,
by checking it against a fixed list of 18 valid account numbers.

## Sample run
```
Charge Account: 5658845
Valid
```

```
Charge Account: 1234567
Invalid
```

```
Charge Account: wew
Invalid
```

## Concepts practiced
- `setOf()` and membership checks with `in`
- Safe number parsing with `toIntOrNull()`
- `if` / `else`

## Notes
- The exercise suggests a tuple. Kotlin has no tuple for this, so a `Set` is used, which also makes the lookup fast.