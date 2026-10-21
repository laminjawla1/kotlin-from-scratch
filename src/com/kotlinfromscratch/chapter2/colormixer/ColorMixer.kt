package com.kotlinfromscratch.chapter2.colormixer

private const val RED = "red"
private const val BLUE = "blue"
private const val YELLOW = "yellow"
private const val PURPLE = "purple"
private const val ORANGE = "orange"
private const val GREEN = "green"

private val PRIMARY_COLORS = listOf(RED, BLUE, YELLOW)

/**
 * Asks for two primary colors and displays the secondary color made by mixing them.
 */
fun main() {
    print("Enter first primary color: ")
    val firstPrimaryColor = readln().lowercase().trim()

    print("Enter second primary color: ")
    val secondPrimaryColor = readln().lowercase().trim()

    if (firstPrimaryColor !in PRIMARY_COLORS || secondPrimaryColor !in PRIMARY_COLORS) {
        println("ERROR: Invalid input. Please enter red, blue or yellow.")
        return
    }

    if (firstPrimaryColor == secondPrimaryColor) {
        println("ERROR: Please enter two different primary colors.")
        return
    }

    val result = when (firstPrimaryColor) {
        RED -> {
            when (secondPrimaryColor) {
                BLUE -> PURPLE
                YELLOW -> ORANGE
                else -> error("Invalid primary color")
            }
        }

        BLUE -> {
            when (secondPrimaryColor) {
                RED -> PURPLE
                YELLOW -> GREEN
                else -> error("Invalid primary color")
            }
        }

        YELLOW -> {
            when (secondPrimaryColor) {
                RED -> ORANGE
                BLUE -> GREEN
                else -> error("Invalid primary color")
            }
        }

        else -> error("Invalid primary color")
    }

    println("RESULT: $result")
}
