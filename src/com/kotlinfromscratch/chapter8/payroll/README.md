# Payroll

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 8, Exercise 5

## Problem
Collect the ID, name, hours worked and hourly pay rate for each employee,
calculate each employee's gross wage as hours × pay rate, and then display
every employee's details and wage.

## Concepts practiced
- `mutableListOf<Map<String, Any>>()` with one map per employee
- `mapOf()` and reading values by key
- `while` loop that only advances on valid input
- Safe number parsing with `toIntOrNull()` and `toDoubleOrNull()`
- Rejecting `NaN` and infinity with `isFinite()`
- String formatting

## Notes
- The exercise uses seven preset employee IDs and parallel lists. This version
  uses a list of maps (one per employee), asks for five employees, and takes
  the ID and a name as input.
- Duplicate employee IDs are rejected.