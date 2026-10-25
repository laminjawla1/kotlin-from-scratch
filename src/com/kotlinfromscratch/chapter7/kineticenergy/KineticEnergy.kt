package com.kotlinfromscratch.chapter7.kineticenergy

/**
 * Asks for an object's mass and velocity and displays its kinetic energy.
 */
fun main() {
    print("Mass (kilograms): ")
    val mass = readln().trim().toDoubleOrNull()

    print("Velocity (meters per second): ")
    val velocity = readln().trim().toDoubleOrNull()

    if (mass == null || mass < 0 || velocity == null) {
        println("ERROR: Invalid input. Please enter a valid object's mass and velocity.")
        return
    }

    val ke = kineticEnergy(mass, velocity)

    println("KINETIC ENERGY: %.1f J".format(ke))
}

fun kineticEnergy(mass: Double, velocity: Double): Double = 0.5 * mass * velocity * velocity