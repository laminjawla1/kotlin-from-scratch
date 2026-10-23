package com.kotlinfromscratch.chapter5.convertalistofcharacterstoastring

/**
 * Reads a list of characters from the user and convert them to a sing string
 */
fun main() {
    val characters = mutableListOf<Char>()
    val str = StringBuilder()

    while (true) {
        print("Enter a character (type 'q' to stop): ")
        val input = readln()

        if (input.lowercase() == "q") break

        if (input.length != 1) {
            println("ERROR: Invalid input. Please enter a single character.")
            continue
        }
        characters.add(input[0])
    }

    for (c in characters) str.append(c)

    println("STRING: $str")
}