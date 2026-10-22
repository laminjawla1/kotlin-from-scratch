package com.kotlinfromscratch.chapter3.seriesofintegers

fun main() {
    print("How many integers? ")
    val n = readln().toIntOrNull()

    if (n == null || n < 1) {
        println("ERROR: Invalid input. Please enter a positive integer.")
        return
    }

    var i = 0
    var sum = 0

    while (i < n) {
        print("Enter an integer: ")
        val number = readln().toIntOrNull()
        if (number == null) {
            println("ERROR: Invalid input. Please enter an integer.")
            continue
        }
        sum += number
        i++
    }

    val average = sum / n.toDouble()

    println("SUM: $sum")
    println("AVERAGE: %.4f".format(average))
}