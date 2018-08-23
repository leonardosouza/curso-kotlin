package fundamentos.funcoes

fun relacaoDeTrabalho(chefe: String, func: String): String {
    return "$func é subordinado à $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"))
    println(relacaoDeTrabalho(func="Maria", chefe="João"))
}