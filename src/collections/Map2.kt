package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Leo", 2 to "Davi", 3 to "Caio")

    for ((id, nome) in map) {
        println("$id - $nome")
    }
}