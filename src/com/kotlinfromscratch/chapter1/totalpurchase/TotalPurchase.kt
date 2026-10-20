package com.kotlinfromscratch.chapter1.totalpurchase

private const val SALES_TAX_PERCENT = 6

/**
 * A program that asks the user for prices of five items
 * calculates the subtotal, sales tax and total order
 */
fun main() {
    print("Enter price for item one: ")
    val itemOnePrice = readln().toDoubleOrNull()

    print("Enter price for item two: ")
    val itemTwoPrice = readln().toDoubleOrNull()

    print("Enter price for item three: ")
    val itemThreePrice = readln().toDoubleOrNull()

    print("Enter price for item four: ")
    val itemFourPrice = readln().toDoubleOrNull()

    print("Enter price for item five: ")
    val itemFivePrice = readln().toDoubleOrNull()

    if ((itemOnePrice == null || itemOnePrice < 0) ||
        (itemTwoPrice == null || itemTwoPrice < 0) ||
        (itemThreePrice == null || itemThreePrice < 0) ||
        (itemFourPrice == null || itemFourPrice < 0) ||
        (itemFivePrice == null || itemFivePrice < 0)) {
        println("ERROR: Invalid input. Please enter valid product prices.")
        return
    }

    val subtotal = itemOnePrice + itemTwoPrice + itemThreePrice + itemFourPrice + itemFivePrice

    val salesTax = subtotal * SALES_TAX_PERCENT / 100

    val total = subtotal + salesTax

    println("SUBTOTAL: %.2f".format(subtotal))
    println("SALES TAX: %.2f".format(salesTax))
    println("TOTAL: %.2f".format(total))
}