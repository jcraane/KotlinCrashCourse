package dev.jamiecraane.kcc.coursecontents.basicsyntax

fun main() {
    val str = "This is a string"
    println(str)

    for (c in str) {
        println(c)
    }

    println(str + "1")

    print("Hello, World!\n")

    // Multi-line strings
    val text = """
        This is a multi-line string
        Another line here
    """.trimIndent()

    println(text)

    // String templates
    val name = "John"
    println("Hello $name")
}
