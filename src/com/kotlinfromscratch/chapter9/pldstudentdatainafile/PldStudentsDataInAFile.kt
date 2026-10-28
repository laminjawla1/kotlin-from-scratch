package com.kotlinfromscratch.chapter9.pldstudentdatainafile

import java.io.File

private const val DELIMITER = "|"
private const val CHOICE_START = 1
private const val CHOICE_END = 5
private const val FILE_NAME = "PLDStudents.txt"

fun main() {
    val students = loadStudents()
    while (true) {
        menu()

        val choice = getChoice()

        when (choice) {
            1 -> addStudent(students)
            2 -> {
                displayStudents(students)
                displaySummary(students)
            }
            3 -> deleteStudent(students)
            4 -> search(students)
            else -> break
        }
    }
}

fun menu() {
println("""
1. Add student
2. Display students
3. Delete student
4. Search
5. Quit
""")
}

private fun addStudent(students: MutableList<Student>) {
    while (true) {
        println("Please fill all fields to correctly add a student.")
        print("MAT #: ")
        val matNumber = readln().trim().toLongOrNull()

        print("First Name: ")
        val firstName = readln().trim()

        print("Last Name: ")
        val lastName = readln().trim()

        print("Midterm: ")
        val midterm = readln().trim().toDoubleOrNull()

        print("Final: ")
        val final = readln().trim().toDoubleOrNull()

        if (matNumber == null || firstName.isBlank() || lastName.isBlank() || midterm == null || final == null) {
            println("ERROR: All fields are required.")
            continue
        }

        if (midterm !in 0.0 .. 50.0 || final !in 0.0 .. 50.0) {
            println("ERROR: Invalid input. Please enter a valid mid final term scores.")
            continue
        }

        if (students.any { it.matNumber == matNumber }) {
            println("ERROR: A student with MAT# $matNumber already exists.")
            continue
        }

        students.add(Student(matNumber, firstName, lastName, midterm, final))
        println("SUCCESS: Student added successfully.")
        dumpStudents(students)
        return
    }
}

private fun displayStudents(students: List<Student>) {
    if (students.isEmpty()) {
        println("No students found.")
        return
    }

    println("%-10s %-12s %-12s %8s %8s %8s".format("MAT#", "FIRST NAME", "LAST NAME", "MIDTERM", "FINAL", "TOTAL"))
    for (s in students) {
        println("%-10d %-12s %-12s %8.1f %8.1f %8.1f".format(s.matNumber, s.firstName, s.lastName, s.midterm, s.final, s.totalGrade))
    }
}

private fun displaySummary(students: List<Student>) {
    if (students.isEmpty()) return
    println("STUDENTS: ${students.size}")
    println("AVERAGE TOTAL GRADE: %.2f".format(students.map { it.totalGrade }.average()))
}

private fun deleteStudent(students: MutableList<Student>) {
    print("MAT #: ")
    val matNumber = readln().trim().toLongOrNull()
    if (matNumber == null) {
        println("ERROR: Invalid input. Please enter a number.")
        return
    }

    if (students.removeIf { it.matNumber == matNumber }) {
        println("Student with MAT# $matNumber is successfully deleted.")
        dumpStudents(students)
    } else {
        println("ERROR: No student matches the given MAT#.")
    }
}

private fun search(students: List<Student>) {
    print("Search Key: ")
    val key = readln().trim().lowercase()

    println("Search Results:")
    displayStudents(students.filter {
        it.matNumber.toString().contains(key) ||
                it.firstName.lowercase().contains(key) ||
                it.lastName.lowercase().contains(key) ||
                it.midterm.toString().contains(key) ||
                it.final.toString().contains(key)
    })
}

private fun getChoice(): Int {
    while (true) {
        print("Choose: ")
        val choice = readln().trim().toIntOrNull()
        if (choice != null && choice in CHOICE_START..CHOICE_END) return choice
        println("ERROR: Invalid input. Please enter a number from $CHOICE_START to $CHOICE_END.")
    }
}

private fun loadStudents(): MutableList<Student> {
    val file = File(FILE_NAME)
    if (!file.exists()) return mutableListOf()

    return file.readLines()
        .filter { it.isNotBlank() }
        .mapNotNull { line ->
            val fields = line.split(DELIMITER)
            if (fields.size != 5) return@mapNotNull null

            val mat = fields[0].toLongOrNull()
            val midterm = fields[3].toDoubleOrNull()
            val final = fields[4].toDoubleOrNull()
            if (mat == null || midterm == null || final == null) null
            else Student(mat, fields[1], fields[2], midterm, final)
        }
        .toMutableList()
}


private fun dumpStudents(students: MutableList<Student>) {
    val file = File(FILE_NAME)
    file.writeText(students.joinToString(separator = "\n") {
        "${it.matNumber}$DELIMITER${it.firstName}$DELIMITER${it.lastName}$DELIMITER${it.midterm}$DELIMITER${it.final}"
    })
}