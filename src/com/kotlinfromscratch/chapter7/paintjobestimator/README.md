# Paint Job Estimator

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 7, Exercise 5

## Problem
Every 115 square feet of wall needs one gallon of paint and eight hours of
labor, and labor costs $20.00 per hour. Ask the user for the wall area in
square feet and the price of paint per gallon, then display the gallons of
paint, the hours of labor, the paint cost, the labor charges and the total
cost of the job. Each calculation lives in its own function.

## Sample run
```
Wall square feet: 230
Price per paint gallon: 25
NUMBER OF GALLONS: 2.0
LABOR HOURS: 16.0
PAINT COST: 50.00
LABOR CHARGES: 320.00
TOTAL PAINT JOB COST: 370.00
```

## Concepts practiced
- Writing several functions with parameters and return values
- Constants with `const val`
- Safe number parsing with `toDoubleOrNull()`
- Reusing one calculation inside another
- String formatting

## Notes
- Gallons are not rounded up, so a result can be a fraction of a gallon.