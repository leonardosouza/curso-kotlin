package fundamentos.controles

fun main(args: Array<String>) {
    var opcao: Int = 0

    while (opcao != -1) {
        var line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolhe a opção $opcao")
    }

    println("Até a próxima!")
}