package com.kotlinfromscratch.chapter1.distancetravelled

/**
 * A program that compute the total distances covered in 5, 8 and 12 minutes
 */
fun main() {
//    5. Distance Traveled
//    Assuming there are no accidents or delays, the distance that a car travels down the interstate
//    can be calculated with the following formula:
//    Distance = Speed × Time
//    A car is traveling at 60 miles per hour. Design a program that displays the following:
//    - The distance the car will travel in 5 hours
//    - The distance the car will travel in 8 hours
//    - The distance the car will travel in 12 hours

    val distanceIn5Hours = 60 * 5
    val distanceIn8Hours = 60 * 8
    val distanceIn12Hours = 60 * 12

    println("The distance the car will travel in 5 hours: $distanceIn5Hours miles")
    println("The distance the car will travel in 8 hours: $distanceIn8Hours miles")
    println("The distance the car will travel in 12 hours: $distanceIn12Hours miles")
}