package com.kotlinfromscratch.chapter2.bodymassindex

/**
 * Asks for weight and height, calculates the BMI, and displays the weight status with a suggestion.
 */
fun main() {
	print("Enter weight in kilograms: ")
	val weight = readln().toDoubleOrNull()

	print("Enter height in meters: ")
	val height = readln().toDoubleOrNull()

	if (weight == null || weight <= 0 || height == null || height <= 0) {
		println("ERROR: Invalid input. Please enter a valid weight and height.")
		return
	}

	if (height > 3) {
		println("ERROR: Invalid input. Please enter height in meters.")
		return
	}

	val bmi = weight / (height * height)


	println("BMI: %.3f".format(bmi))

	if (bmi < 18.5) {
		println("STATUS: Underweight")
		println("SUGGESTION: To gain weight safely, eat more frequent, " +
				"nutrient-dense meals packed with healthy calories—such as nuts, seeds, whole grains, " +
				"and lean proteins—and consult a healthcare provider or a dietitian to rule out underlying medical causes.")
	} else if (bmi <= 25.0) {
		println("STATUS: Optimal")
		println("SUGGESTION: Focus on maintaining this balance through a nutritious diet, regular physical activity, " +
				"adequate sleep, and routine health checks rather than trying to lose or gain weight.")
	} else if (bmi < 30) {
		println("STATUS: Overweight")
		println("SUGGESTION: Eat more whole foods like vegetables, fruits, and lean proteins, and aim for regular physical activity. " +
				"A modest weight loss of 5% to 10% can greatly improve your health.")
	} else {
		println("STATUS: Obese")
		println("SUGGESTION: Focus on adding positive habits rather than just restricting yourself. " +
				"Instead of focusing entirely on what you need to cut out of your diet, " +
				"try focusing on what you can add—like drinking one extra glass of water a day, " +
				"adding a serving of vegetables to your dinner, or taking a 10-minute walk after lunch.")
	}

}
