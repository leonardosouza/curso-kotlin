package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String = "$dia/$mes/$ano"
}

fun main(args: Array<String>) {
    val nascimento = Data(8, 10, 1982)

    println(nascimento.formatar())

    with(nascimento) { println("$dia/$mes/$ano") }
}