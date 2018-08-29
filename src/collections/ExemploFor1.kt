package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Ricardo")

    for (aluno in alunos) {
        println(aluno)
    }

    for ((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno")
    }
}