package fundamentos

fun main(args: Array<String>) {
    // tipo numerico inteiro
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_438_647
    val num4: Long = 9_233_372_036_854_775 // Long.MAX_VALUE

    // tipo numerico reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // tipo caractere
    val char: Char = '?' // e

    // tipo boolean
    val boolean: Boolean = true // or false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(9_233_372_036_854_775 is Long)
    println(1.0 is Double)
    println(10.dec())
}