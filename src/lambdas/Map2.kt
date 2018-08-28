package lambdas

class Produto(val nome: String, val preco: Double)

var materialEscolar = listOf(
    Produto("Fichário", 21.90),
    Produto("Lápis", 11.90),
    Produto("Borracha", 0.90),
    Produto("Apontador", 1.90)
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual }

    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço total é $precoTotal")
    println("O preço média é ${precoTotal / materialEscolar.size}")
}