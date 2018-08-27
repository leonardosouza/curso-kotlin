package funcoes

fun potencia(base: Int = 2, exp: Int = 1): Int {
    return Math.pow(base.toDouble(), exp.toDouble()).toInt()
}

fun main(args: Array<String>) {
    println(potencia(2, 3))
    println(potencia(10))
    println(potencia(base = 10))
    println(potencia(exp = 8))
}