package com.kotlinfromscratch.chapter2.timecalculator

private const val SECONDS_PER_DAY = 86_400
private const val SECONDS_PER_HOUR = 3_600
private const val SECONDS_PER_MINUTE = 60

/**
 * Asks for a number of seconds and breaks it down into days, hours, minutes and seconds.
 */
fun main() {
    print("Enter seconds: ")
    val totalSeconds = readln().toIntOrNull()

    if (totalSeconds == null || totalSeconds < 0) {
        println("ERROR: Invalid input. Please enter a whole number of seconds.")
        return
    }

    var remaining = totalSeconds
    var days = 0
    var hours = 0
    var minutes = 0

    if (remaining >= SECONDS_PER_DAY) {
        days = remaining / SECONDS_PER_DAY
        remaining %= SECONDS_PER_DAY
    }

    if (remaining >= SECONDS_PER_HOUR) {
        hours = remaining / SECONDS_PER_HOUR
        remaining %= SECONDS_PER_HOUR
    }

    if (remaining >= SECONDS_PER_MINUTE) {
        minutes = remaining / SECONDS_PER_MINUTE
        remaining %= SECONDS_PER_MINUTE
    }

    println("DAYS: $days")
    println("HOURS: $hours")
    println("MINUTES: $minutes")
    println("SECONDS: $remaining")
}