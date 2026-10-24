package com.kotlinfromscratch.chapter7.stadiumseating

private const val CLASS_A_PRICE = 15.0
private const val CLASS_B_PRICE = 12.0
private const val CLASS_C_PRICE = 9.0

/**
 * Asks how many tickets were sold in each of three seating classes and displays the revenue per class and in total.
 */
fun main() {
    print("How many Class A tickets were sold? ")
    val classATickets = readln().trim().toIntOrNull()

    print("How many Class B tickets were sold? ")
    val classBTickets = readln().trim().toIntOrNull()

    print("How many Class C tickets were sold? ")
    val classCTickets = readln().trim().toIntOrNull()

    if (classATickets == null || classATickets < 0 ||
        classBTickets == null || classBTickets < 0 ||
        classCTickets == null || classCTickets < 0
    ) {
        println("ERROR: Invalid input. Please enter zero or a positive whole number for each class.")
        return
    }

    val classARevenue = calculateRevenue(classATickets, CLASS_A_PRICE)
    val classBRevenue = calculateRevenue(classBTickets, CLASS_B_PRICE)
    val classCRevenue = calculateRevenue(classCTickets, CLASS_C_PRICE)
    val totalRevenue = classARevenue + classBRevenue + classCRevenue

    println("CLASS A REVENUE: $%.2f".format(classARevenue))
    println("CLASS B REVENUE: $%.2f".format(classBRevenue))
    println("CLASS C REVENUE: $%.2f".format(classCRevenue))
    println("TOTAL REVENUE: $%.2f".format(totalRevenue))
}

private fun calculateRevenue(tickets: Int, price: Double): Double = tickets * price