package com.kotlinfromscratch.chapter3.caloriesburned

private const val CALORIES_PER_MINUTE = 3.9

/**
 * Displays the calories burned on a treadmill after 10, 15, 20, 25 and 30 minutes, at 3.9 calories per minute.
 */
fun main() {
    for (minute in 10..30 step 5) {
        val calories = CALORIES_PER_MINUTE * minute
        println("Calories Burned in $minute minutes: %.1f".format(calories))
    }
}