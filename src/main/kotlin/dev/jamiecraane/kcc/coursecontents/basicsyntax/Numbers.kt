package dev.jamiecraane.kcc.coursecontents.basicsyntax

fun main() {
    numberDeclaration()
//    basicOperators()
//    unsignedIntegerTypes()
}

private fun basicOperators() {
    val a = 10
    val b = 20
    println(a + b)

    val result = a / 3
    println(result) // result is still an Int
    println(result == 3)
//    println(result == 3.0) // Compile error

    val divisionByDouble = a / 3.0
    println(divisionByDouble)

    val bitWise = 0b0101 and 0b0011
    println(bitWise)
}

private fun numberDeclaration() {
    val int = 1000

    println(int)
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)

    val byte: Byte = 127
    println(byte)

    val int2 = 1_000_000
    println(int2)

    val myLong = 1000L
    println(myLong)

    val float = 10F
    println(float)

    val double = 25.0
    println(double)

    // Literal constants
    val hex = 0xFFEC3A
    println(hex)

    val hexSeparator = 0xFF_EC_3A
    println(hexSeparator)

    val bits = 0b11010010
    println(bits)
}

private fun unsignedIntegerTypes() {
    val unsignedByte: UByte = 1u
    println(unsignedByte)

    val a1 = 42u
    println(a1)

    val unsigedLong = 1UL
    println(unsignedByte)
}
