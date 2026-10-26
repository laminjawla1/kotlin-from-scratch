package com.kotlinfromscratch.chapter8.vowels

/**
 * Generates 50 random uppercase letters and counts how many times each vowel appears.
 */
fun main() {
    val randomLetters = List(50) { ('A'..'Z').random() }

    val vowelCounts = randomLetters
        .filter { it in "AEIOU" }
        .groupingBy { it }
        .eachCount()

    println("RANDOM ALPHABETS: ${randomLetters.joinToString("")}")
    for (vowelCount in vowelCounts) println("VOWEL: ${vowelCount.key} | COUNT: ${vowelCount.value}")
}