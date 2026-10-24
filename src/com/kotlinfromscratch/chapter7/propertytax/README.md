# Property Tax

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 7, Exercise 2

## Problem
A property's assessment value is 60 percent of its actual value, and the
property tax is 64 cents for every $100 of assessment value. Ask the user
for the actual value of a property and display the assessment value and the
property tax, using a separate function for each calculation.

## Sample run
```
Property value: 10000
ASSESSMENT VALUE: $6000.00
PROPERTY TAX: $38.40
```

```
Property value: 10250
ASSESSMENT VALUE: $6150.00
PROPERTY TAX: $39.36
```

## Concepts practiced
- Writing functions with parameters and return values
- Constants with `const val`
- `private` functions
- Safe number parsing with `toDoubleOrNull()`
- String formatting

## Notes
- Tax is proportional, so partial hundreds are taxed too.