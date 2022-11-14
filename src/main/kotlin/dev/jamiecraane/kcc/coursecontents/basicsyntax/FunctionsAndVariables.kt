package dev.jamiecraane.kcc.coursecontents.basicsyntax

fun main() {
    val name = "John Smith"

    println(sayHello(name))
}

private fun sayHello(name: String): String {
    return "Hello $name"
}
