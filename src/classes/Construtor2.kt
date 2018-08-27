package classes

class OutroFilme(val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = OutroFilme("Monstros S/A", 2001, "Comédia")

    println("O ${filme.nome} é um ${filme.genero} e foi lançado em ${filme.anoLancamento}")
}