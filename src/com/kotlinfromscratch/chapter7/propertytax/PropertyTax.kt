package com.kotlinfromscratch.chapter7.propertytax

private const val ASSESSMENT_PERCENT = 60
private const val TAX_PER_100 = 0.64

/**
 * Asks for the actual value of a property and displays its assessment value and property tax.
 */
fun main() {
    print("Property value: ")
    val value = readln().trim().toDoubleOrNull()

    if (value == null || value < 0) {
        println("ERROR: Invalid input. Please enter a non-negative number.")
        return
    }

    val assessmentValue = getAssessmentValue(value)
    val propertyTax = getPropertyTax(assessmentValue)

    println("ASSESSMENT VALUE: $%.2f".format(assessmentValue))
    println("PROPERTY TAX: $%.2f".format(propertyTax))
}

private fun getAssessmentValue(value: Double): Double = value * ASSESSMENT_PERCENT / 100

private fun getPropertyTax(assessmentValue: Double): Double = assessmentValue / 100 * TAX_PER_100