package classes

class ItemDePedido(val nome: String, var preco: Double) {
    // variaveis e método estaticos
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val item1 = ItemDePedido.create("TV 50 Pol", 2999.90)
    val item2 = ItemDePedido("Liquidificador", 299.90)

    ItemDePedido.desconto = 0.1 // estatico

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}