# PLD Students Data in a File

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 9, Exercise 3

## Problem
Manage the records of the students in a class: MAT number, first name, last
name, midterm score and final score. Save the records to a file named
`PLDStudents.txt`, read them back when the program starts, and display each
student's total grade, the number of students and the average total grade.

## Sample run
```
1. Add student
2. Display students
3. Delete student
4. Search
5. Quit

Choose: 2
MAT#       FIRST NAME   LAST NAME     MIDTERM    FINAL    TOTAL
1001       Jane         Doe              48.0     49.0     97.0
1002       John         Smith            40.0     38.0     78.0
STUDENTS: 2
AVERAGE TOTAL GRADE: 87.50
```

## Concepts practiced
- `data class` with a computed property
- A mutable list of objects, saved to and loaded from a text file
- `File.readLines()` and `File.writeText()`
- `mapNotNull` to skip bad lines
- A menu loop with `when`
- Searching with `filter` and `contains`

## Notes
- Records are stored one per line, with fields separated by `|`.
- Midterm and final scores are each out of 50.
- MAT numbers must be unique.
- The exercise uses a list of dictionaries. This version uses a `data class`.
- Menu, delete and search go beyond the exercise.