# Kilometer Converter

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 7, Exercise 1

## Problem
Ask the user for a distance in kilometers and display it in miles, using
miles = kilometers × 0.6214. The conversion lives in its own function.

## Sample run
```
Distance in kilometers: 1000
621.40 miles
```

```
Distance in kilometers: abc
ERROR: Invalid input. Please enter a positive number.
```

## Concepts practiced
- Writing a function with a parameter and a return value
- Single-expression function (`= kilometers * 0.6214`)
- Constants with `const val`
- Safe number parsing with `toDoubleOrNull()`
- String formatting

## Notes
- The conversion is a separate function so it can be reused and tested on its own.