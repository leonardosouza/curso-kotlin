package collections

fun main(args: Array<String>) {
    val strings = arrayListOf<String>("Carro", "Moto", "Barco", "Avião")

    for (item in strings) {
        println(item.toUpperCase())
    }
}