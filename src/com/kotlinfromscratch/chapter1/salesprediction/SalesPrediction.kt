package com.kotlinfromscratch.chapter1.salesprediction

private const val ANNUAL_PROFIT_PERCENT = 23

fun main() {

    print("Enter Total Sales: ")
    val totalSales = readln().toDoubleOrNull()

    if (totalSales == null || totalSales < 0) {
        println("ERROR: Invalid input. Please enter a valid number for total sales.")
        return
    }

    val profit = totalSales * ANNUAL_PROFIT_PERCENT / 100

    println("Profit: ${"%.2f".format(profit)}")
}
