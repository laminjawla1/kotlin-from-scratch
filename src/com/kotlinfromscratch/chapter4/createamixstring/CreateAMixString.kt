package com.kotlinfromscratch.chapter4.createamixstring

import kotlin.math.min

/**
 * Asks for three strings and builds a new one by interleaving their characters, up to the length of the shortest.
 */
fun main() {
    print("Enter string 1: ")
    val text1 = readln()

    print("Enter string 2: ")
    val text2 = readln()

    print("Enter string 3: ")
    val text3 = readln()

    val shortestLength = minOf(text1.length, text2.length, text3.length)

    val newString = StringBuilder(shortestLength)
    for (i in 0 ..< shortestLength) {
        newString.append(text1[i])
        newString.append(text2[i])
        newString.append(text3[i])
    }

    println("NEW STRING: $newString")
}