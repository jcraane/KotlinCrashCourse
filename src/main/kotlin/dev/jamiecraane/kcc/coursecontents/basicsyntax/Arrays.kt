package dev.jamiecraane.kcc.coursecontents.basicsyntax

fun main() {
    val myArray = arrayOf(1, 2, 3, 4, 5)
    println(myArray)

    val myArray2 = Array(5) { i ->
        i + 1
    }

    myArray.forEach { println(it) }
    println()
    myArray2.forEach { println(it) }
}
