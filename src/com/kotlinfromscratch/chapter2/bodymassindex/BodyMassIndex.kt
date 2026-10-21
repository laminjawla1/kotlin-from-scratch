package com.kotlinfromscratch.chapter2.bodymassindex


/**
 * Ask the user for their weight and height, calculates the BMI and display whether the user is underweight, normal or overweight.
 *
 * The user will also have suggestions on how to maintain or improve their BMI based on their status
 */
fun main() {
	print("Enter weight in pounds: ")
	val weight = readln().toDoubleOrNull()

	print("Enter height in inches: ")
	val height = readln().toDoubleOrNull()

	if (weight == null || weight <= 0 || height == null || height <= 0) {
		println("ERROR: Invalid input. Please enter a valid weight and height.")
		return
	}

	val bmi = (weight / height * height) * 703


	println("BMI: $bmi")

	if (bmi < 18.5) {
		println("STATUS: Underweight")
		println("SUGGESTION: To gain weight safely, eat more frequent, nutrient-dense meals packed with healthy calories—such as nuts, seeds, whole grains, and lean proteins—and consult a healthcare provider or a dietitian to rule out underlying medical causes.")
	}
	else if (bmi in 18.5 .. 25.0) {
		println("STATUS: Optimal")
		println("SUGGESTION: Focus on maintaining this balance through a nutritious diet, regular physical activity, adequate sleep, and routine health checks rather than trying to lose or gain weight.")
	} else {
		println("STATUS: Overweight")
		println("SUGGESTION: Eat more whole foods like vegetables, fruits, and lean proteins, and aim for regular physical activity. A modest weight loss of 5% to 10% can greatly improve your health.")
	}

}
