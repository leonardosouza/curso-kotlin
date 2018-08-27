package fundamentos

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any) {
    when (x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(2))
        else -> println("Repensa sua vida")
    }
}

fun main(args: Array<String>) {
    souEsperto("c6 bank")
    souEsperto(0)

    souEsperto2("opa")
    souEsperto2(3)
}