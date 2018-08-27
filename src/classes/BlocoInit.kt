package classes

class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme3 = Filme3("Os Incríveis", 2004, "ação")
    println("O filme ${filme3.nome} (${filme3.genero}) foi lançado em ${filme3.anoLancamento}")
}