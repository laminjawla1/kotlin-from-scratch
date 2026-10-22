package com.kotlinfromscratch.chapter4.reverseastring

/**
 * Reverses a string
 */
fun main() {
    print("Enter a string: ")
    val text = readln()

    val reversed = StringBuilder()

    for (i in text.length - 1 downTo 0)
        reversed.append(text[i])

    println("REVERED: $reversed")
}