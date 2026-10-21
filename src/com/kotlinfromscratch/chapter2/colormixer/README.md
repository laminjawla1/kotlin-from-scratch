# Color Mixer

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 2, Exercise 8

## Problem
Red, blue and yellow are the primary colors. Mixing two of them makes a
secondary color: red + blue = purple, red + yellow = orange, and
blue + yellow = green. Ask the user for two primary colors and display the
resulting secondary color. If either input is not a primary color, display
an error message.

## Sample run
```
Enter first primary color: yellow
Enter second primary color: RED
RESULT: orange
```

```
Enter first primary color: green
Enter second primary color: red
ERROR: Invalid input. Please enter red, blue or yellow.
```

## Concepts practiced
- Constants with `const val`
- Cleaning up text input with `trim()` and `lowercase()`
- Membership checks with `in` / `!in` on a `listOf()` list
- Nested `when` expressions
- Error handling