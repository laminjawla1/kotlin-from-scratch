package com.kotlinfromscratch.chapter1.stocktransaction

private const val COMMISSION_PERCENT = 2

/**
 * Calculates whether a stock purchase and sale made a profit or a loss, including broker commissions.
 */
fun main() {
    val sharesPurchased = 1_000
    val sharesPurchasedUnitPrice = 32.87
    val sharesPurchasedBrokerCommissionPercent = COMMISSION_PERCENT
    val sharesPurchasedSubtotal = sharesPurchased * sharesPurchasedUnitPrice
    val sharesPurchasedBrokerCommission = sharesPurchasedSubtotal * sharesPurchasedBrokerCommissionPercent / 100
    val sharesPurchasedTotal = sharesPurchasedBrokerCommission + sharesPurchasedSubtotal

    val sharesSold = 1_000
    val sharesSoldUnitPrice = 33.92
    val sharesSoldBrokerCommissionPercent = COMMISSION_PERCENT
    val sharesSoldSubtotal = sharesSold * sharesSoldUnitPrice
    val sharesSoldBrokerCommission = sharesSoldSubtotal * sharesSoldBrokerCommissionPercent / 100
    val sharesSoldTotal = sharesSoldSubtotal - sharesSoldBrokerCommission

    val profit = sharesSoldTotal - sharesPurchasedTotal

    println("AMOUNT PAID FOR STOCK: %.2f".format(sharesPurchasedSubtotal))
    println("AMOUNT PAID TO BROKER AT PURCHASE: %.2f".format(sharesPurchasedBrokerCommission))
    println("STOCK SOLD FOR: %.2f".format(sharesSoldSubtotal))
    println("AMOUNT PAID TO BROKER AT SALE: %.2f".format(sharesSoldBrokerCommission))

    if (profit > 0) {
        println("PROFIT: %.2f".format(profit))
    } else if (profit < 0) {
        println("LOSS: %.2f".format(-profit))
    } else {
        println("BREAK EVEN: %.2f".format(profit))
    }
}