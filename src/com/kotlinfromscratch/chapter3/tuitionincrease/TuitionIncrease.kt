package com.kotlinfromscratch.chapter3.tuitionincrease

private const val TUITION_PER_SEMESTER = 6_000.0
private const val TUITION_INCREASE_PERCENT = 2

fun main() {
    var semesterFee = TUITION_PER_SEMESTER

    for (year in 1..5) {
        semesterFee += semesterFee * TUITION_INCREASE_PERCENT / 100
        println("YEAR $year: SEMESTER FEE = %.2f".format(semesterFee))
    }
}