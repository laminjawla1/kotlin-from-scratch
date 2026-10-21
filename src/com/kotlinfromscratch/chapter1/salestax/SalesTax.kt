package com.kotlinfromscratch.chapter1.salestax

private const val VAT_TAX_PERCENT = 15

/**
 * Ask the user for a total purchase, compute vat tax and output the total purchase, vat tax and total sales
 */
fun main() {
    print("Enter Total Purchase: ")
    val totalPurchase = readln().toDoubleOrNull()

    if (totalPurchase == null || totalPurchase < 0) {
        println("ERROR: Invalid input. Please enter a valid total purchase")
        return
    }

    val vat = totalPurchase * VAT_TAX_PERCENT / 100
    val totalSale = totalPurchase + vat

    println("TOTAL PURCHASE: %.2f".format(totalPurchase))
    println("VAT TAX: %.2f".format(vat))
    println("TOTAL SALE: %.2f".format(totalSale))
}