package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(123, "Leo")
    map.put(456, "Caio")
    map.put(789, "Davi")

    for (item in map.entries) {
        println(item)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (nome in map.keys) {
        println(nome)
    }

    for ((id, nome) in map) {
        println("$nome - id: $id")
    }

    map.size.print()
    map.get(789)?.print()
    map[123]?.print()
    map.containsKey(456).print()
    map.clear()
    map.isEmpty().print()
}