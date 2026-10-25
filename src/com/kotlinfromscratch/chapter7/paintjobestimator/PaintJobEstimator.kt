package com.kotlinfromscratch.chapter7.paintjobestimator

private const val LABOR_HOURS_PER_115_SQ_FT = 8
private const val PAY_PER_HOUR = 20.00
private const val SQUARE_FEET_PER_WALL_SPACE = 115.0

/**
 * Asks for the wall area and the paint price per gallon, then displays the gallons, labor hours, costs and total for the job.
 */
fun main() {
    print("Wall square fee: ")
    val wallSquareFeet = readln().toDoubleOrNull()

    print("Price per paint gallon: ")
    val price = readln().toDoubleOrNull()

    if (wallSquareFeet == null || wallSquareFeet <= 0 || price == null || price <= 0) {
        println("ERROR. Invalid input. Please enter positive numbers for both wall square feet and price.")
        return
    }

    val numberOfGallons = getNumberOfGallons(wallSquareFeet)
    val labourHours = getLabourHours(wallSquareFeet)
    val paintCost = getPaintCost(numberOfGallons, price)
    val labourCharges = getLaborCharges(labourHours, PAY_PER_HOUR)
    val totalJobCost = paintCost + labourCharges

    println("NUMBER OF GALLONS: %.1f".format(numberOfGallons))
    println("LABOUR HOURS: %.1f".format(labourHours))
    println("PAINT COST: %.2f".format(paintCost))
    println("LABOUR CHARGES: %.2f".format(labourHours))
    println("TOTAL PAINT JOB COST: %.2f".format(totalJobCost))
}

private fun getNumberOfGallons(squareFeet: Double): Double = squareFeet / SQUARE_FEET_PER_WALL_SPACE

private fun getLabourHours(squareFeet: Double): Double = squareFeet / SQUARE_FEET_PER_WALL_SPACE * LABOR_HOURS_PER_115_SQ_FT

private fun getPaintCost(gallons: Double, unitPrice: Double): Double = gallons * unitPrice

private fun getLaborCharges(hours: Double, pay: Double): Double = hours * pay
