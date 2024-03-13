import java.util.Scanner
fun main() {
    println("Welcome to the Student Grade Calculator")
    println("Please enter the student's name:")
    val name = readLine()!!.toString()

    println("Please enter the student's marks:")
    val marks = readLine()!!.toInt()

    val grade = calculateGrade(marks)
    println("Student Name: $name")
    println("Marks Obtained: $marks")
    println("Grade: $grade")
}

fun calculateGrade(marks: Int): String {
    return when {
        marks >= 90 -> "A"
        marks >= 80 -> "B"
        marks >= 70 -> "C"
        marks >= 60 -> "D"
        else -> "E"
    }
}

