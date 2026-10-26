package com.kotlinfromscratch.chapter8.chargeaccountvalidation

private val VALID_ACCOUNT_NUMBERS = setOf(
    5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
    8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
    1005231, 6545231, 3852085, 7576651, 7881200, 4581002
)

/**
 * Asks the user for a charge account number and check whether it exists in the database
 */
fun main() {
    print("Charge Account: ")
    val number = readln().trim().toIntOrNull()
    println(if (number in VALID_ACCOUNT_NUMBERS) "Invalid" else "Valid")
}