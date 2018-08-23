package fundamentos.operadores

fun obterResultado(num: Double): String = if (num >= 7) "Passou" else "Reprovou"


fun main(args: Array<String>) {
    print(obterResultado(4.3))
}