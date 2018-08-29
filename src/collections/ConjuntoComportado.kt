package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("")
    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("")
    println("Linked...")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("")
    println("Sorted...")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    println("")
    println("Ordem maluca...")
    aprovados.sortedBy { it.substring(1).reversed() }.print()
}