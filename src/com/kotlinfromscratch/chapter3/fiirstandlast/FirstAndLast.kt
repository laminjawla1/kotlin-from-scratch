package com.kotlinfromscratch.chapter3.fiirstandlast

/**
 * Asks the user for a series of names and display lexicographically display the first and last names
 */
fun main() {
    print("How many names? ")
    val n = readln().toIntOrNull()

    if (n == null || n < 1) {
        println("ERROR: Invalid input. Please enter a positive integer.")
        return
    }

    var i = 0
    var first: String? = null
    var last: String? = null

    while (i < n) {
        print("Enter a name: ")
        val name = readln().trim()
        if (name.isEmpty()) {
            println("ERROR: Invalid input. Please enter a valid name")
            continue
        }

        if (first == null || name.compareTo(first, ignoreCase = true) < 0) first = name
        if (last == null || name.compareTo(last, ignoreCase = true) > 0) last = name
        i++
    }

    if (first == null) {
        println("No names were entered.")
    } else {
        println("FIRST: $first")
        println("LAST: $last")
    }
}