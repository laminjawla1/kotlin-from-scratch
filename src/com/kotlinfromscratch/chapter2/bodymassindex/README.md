# Body Mass Index

**Source:** Programming Logic and Design, Mr. Amer El-Hashemite, lecture notes, Year 1 Semester 1, Chapter 2, Exercise 12

## Problem
Ask the user for their weight in kilograms and height in meters, then
calculate the BMI using BMI = weight / (height × height). Display whether
the person is underweight (BMI below 18.5), optimal (18.5 up to and
including 25) or overweight (above 25).

## Sample run
```
Enter weight in kilograms: 70
Enter height in meters: 1.7
BMI: 24.221
STATUS: Optimal
SUGGESTION: Focus on maintaining this balance through a nutritious diet, regular physical activity, adequate sleep, and routine health checks rather than trying to lose or gain weight.
```

```
Enter weight in kilograms: 90
Enter height in meters: 1.75
BMI: 29.388
STATUS: Overweight
SUGGESTION: Eat more whole foods like vegetables, fruits, and lean proteins, and aim for regular physical activity. A modest weight loss of 5% to 10% can greatly improve your health.
```

## Concepts practiced
- Immutable variables with `val`
- Safe number parsing with `toDoubleOrNull()`
- Comparison chains with `if` / `else if` / `else`
- Error handling

## Notes
The "Obese" category (BMI of 30 and above) and the suggestions go beyond
the exercise. BMI is a screening measure, not a medical diagnosis.