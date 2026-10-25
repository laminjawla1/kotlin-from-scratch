package com.kotlinfromscratch.chapter7.fallingdistance

private const val g = 9.8

/**
 * Displays the distance in meters that an object falls after 5 to 10 seconds, using d = 1/2 * g * t^2.
 */
fun main() {
    for (time in 5..10) {
        val distance = fallingDistance(time.toDouble())
        println("Distance after $time seconds: %.1f".format(distance))
    }
}

private fun fallingDistance(time: Double): Double = 0.5 * g * time * time