# Kinetic Energy

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 7, Exercise 8

## Problem
A moving object has kinetic energy KE = ½ × m × v², where m is its mass in
kilograms and v is its velocity in meters per second. Write a function named
`kineticEnergy` that takes the mass and velocity and returns the energy. Use
it in a program that asks the user for both values and displays the result.

## Sample run
```
Mass (kilograms): 23.876
Velocity (meters per second): 3
KINETIC ENERGY: 107.4 J
```

```
Mass (kilograms): 10
Velocity (meters per second): -2
KINETIC ENERGY: 20.0 J
```

## Concepts practiced
- Writing a function with parameters and a return value
- Safe number parsing with `toDoubleOrNull()`
- Validating one input but not the other
- String formatting

## Notes
- Velocity can be negative, because squaring it removes the sign.