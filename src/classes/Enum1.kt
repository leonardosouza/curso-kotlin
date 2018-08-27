package classes

enum class DiaSemana {
    DOM, SEG, TER, QUA, QUI, SEX, SAB
}

fun main(args: Array<String>) {
    println("O melhor dia da semana é ${DiaSemana.SAB}")
}