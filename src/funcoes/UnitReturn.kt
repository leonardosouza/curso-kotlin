package funcoes

fun imprimeMaior(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimeMaior2(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimeMaior3(a: Int, b: Int) {
    println(Math.max(a, b))
    return
}

fun imprimeMaior4(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMaior(2, 3)
    imprimeMaior2(2, 3)
    imprimeMaior3(2, 3)
    imprimeMaior4(2, 3).run { 3 > 2 }.run { print("Resultado = $this") }
}