package com.kotlinfromscratch.chapter8.payroll

private const val EMPLOYEES_COUNT = 5

/**
 * Asks for five employees' ID, name, hours and pay rate, then displays each employee's gross wage.
 */
fun main() {
    val employees = mutableListOf<Map<String, Any>>()

    var i = 1
    while (i <= EMPLOYEES_COUNT) {
        print("Enter employee #$i ID: ")
        val id = readln().trim().toIntOrNull()

        print("Enter employee #$i NAME: ")
        val name = readln().trim()

        print("Enter employee #$i HOURS: ")
        val hours = readln().trim().toIntOrNull()

        print("Enter employee #$i PAY RATE: ")
        val payRate = readln().trim().toDoubleOrNull()

        if (id == null || id < 1 || name.isEmpty() || hours == null || hours < 0 ||
            payRate == null || payRate !in 1.0 ..Double.MAX_VALUE
        ) {
            println("ERROR: Invalid input. Please enter valid data for all fields.")
            continue
        }

        if (employees.any { it["id"] == id }) {
            println("ERROR: Employee ID $id has already been entered.")
            continue
        }

        val employee = mapOf(
            "id" to id,
            "name" to name,
            "hours" to hours,
            "payRate" to payRate,
            "wage" to hours * payRate
        )
        employees.add(employee)

        println()

        i++
    }

    for (employee in employees) {
        println("ID: ${employee["id"]}")
        println("NAME: ${employee["name"]}")
        println("HOURS: ${employee["hours"]}")
        println("PAY RATE: %.2f".format(employee["payRate"]))
        println("WAGE: %.2f".format(employee["wage"]))

        println()
    }
}