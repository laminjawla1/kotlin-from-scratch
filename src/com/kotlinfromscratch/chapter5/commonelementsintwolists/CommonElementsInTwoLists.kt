package com.kotlinfromscratch.chapter5.commonelementsintwolists

/**
 * Reads two lists of numbers and displays the elements they have in common
 */
fun main() {
    val list1 = getElements("Populate the first list:")
    val list2 = getElements("Populate the second list:")

    val commonItems = list1.intersect(list2)

    println("COMMON ITEMS: $commonItems")
}

private fun getElements(prompt: String): Set<Int> {
    val numbers = mutableSetOf<Int>()

    println(prompt)
    while (true) {
        print("Enter a number (type 'q' to stop): ")
        val input = readln().trim().lowercase()

        if (input == "q") break

        val number = input.toIntOrNull()
        if (number == null) {
            println("ERROR: Invalid input. Please enter an integer.")
            continue
        }
        numbers.add(number)
    }
    return numbers
}