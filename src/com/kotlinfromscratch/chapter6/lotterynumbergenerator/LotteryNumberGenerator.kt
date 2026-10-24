package com.kotlinfromscratch.chapter6.lotterynumbergenerator

/**
 * Generates a 7-digit lottery number
 */
fun main() {
    val lotteryNumber = (0..49).shuffled().take(7)
    println("LOTTERY NUMBER: $lotteryNumber")
}