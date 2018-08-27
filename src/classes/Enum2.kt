package classes

enum class DiasDaSemana(val id: Int, val nome: String, val util: Boolean) {
    DOM(1, "Domingo", false),
    SEG(2, "Segunda", true),
    TER(3, "Terça", true),
    QUA(4, "Quarta", true),
    QUI(5, "Quinta", true),
    SEX(6, "Sexta", true),
    SAB(7, "Sábado", false),
}

fun main(args: Array<String>) {
    for (dia in DiasDaSemana.values()) {
        println("${dia.nome} é um dia ${if (dia.util) "útil" else "do fim de semana"}.")
    }
}