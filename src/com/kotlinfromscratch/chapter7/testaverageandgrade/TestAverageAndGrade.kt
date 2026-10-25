package com.kotlinfromscratch.chapter7.testaverageandgrade

private const val NUMBER_OF_SCORES = 5

/**
 * Asks the user for NUMBER_OF_SCORES scores, calculate and display the average and grade.
 */
fun main() {
    val scores = mutableListOf<Double>()

    var i = 1
    while (i <= NUMBER_OF_SCORES) {
        print("Enter score #$i: ")
        val score = readln().trim().toDoubleOrNull()

        if (score == null || score < 0 || score > 100) {
            println("ERROR: Invalid input. Please enter a score between 0 to 100.")
            continue
        }

        scores.add(score)

        i++
    }

    for (score in scores) println("SCORE: $score | GRADE: ${determineGrade(score)}")
    println("AVERAGE: GRADE: %.1f".format(calcAverage(scores)))
}

fun calcAverage(scores: List<Double>): Double = scores.average()

fun determineGrade(score: Double): String {
    return when {
        score in 90.0..100.0 -> "A"
        score in 80.0..89.0 -> "B"
        score in 70.0..79.0 -> "C"
        score in 60.0..69.0 -> "D"
        score < 60.0 -> "F"
        else -> "Invalid grade"
    }
}