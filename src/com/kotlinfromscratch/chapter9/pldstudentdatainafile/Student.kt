package com.kotlinfromscratch.chapter9.pldstudentdatainafile

data class Student(
    val matNumber: Long,
    val firstName: String,
    val lastName: String,
    val midterm: Double,
    val final: Double,
) {
    val totalGrade: Double get() = midterm + final
}