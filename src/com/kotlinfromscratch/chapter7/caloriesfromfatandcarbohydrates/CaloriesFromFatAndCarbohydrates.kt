package com.kotlinfromscratch.chapter7.caloriesfromfatandcarbohydrates

private const val CALORIES_PER_FAT = 9
private const val CALORIES_PER_CARB = 4

/**
 * Asks for the grams of fat and carbohydrates eaten in a day and displays the calories from each.
 */
fun main() {
    print("Fat Grams: ")
    val fatGrams = readln().toDoubleOrNull()

    print("Carb Grams: ")
    val carbGrams = readln().toDoubleOrNull()

    if (fatGrams == null || fatGrams < 0 || carbGrams == null || carbGrams < 0) {
        println("ERROR: Invalid input. Please enter positive numbers for fat and carb grams.")
        return
    }

    val caloriesFromFat = getCaloriesFromFat(fatGrams)
    val caloriesFromCarb = getCaloriesFromCarb(carbGrams)

    println("CALORIES FROM FAT: %.1f".format(caloriesFromFat))
    println("CALORIES FROM CARB: %.1f".format(caloriesFromCarb))
}

private fun getCaloriesFromFat(fatGrams: Double): Double = fatGrams * CALORIES_PER_FAT

private fun getCaloriesFromCarb(carbGrams: Double): Double = carbGrams * CALORIES_PER_CARB
