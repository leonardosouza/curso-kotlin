package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Arthur", 8.0),
        Aluno("Rafael", 6.4),
        Aluno("Ricardo", 7.7)
    )

    val aprovados = alunos.filter { it.nota >= 7 }.sortedBy { it.nome }

    println(aprovados)
}