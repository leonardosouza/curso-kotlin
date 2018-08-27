package classes

class Calculadora {
    private var resultado: Int = 0

    fun soma(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplica(vararg valores: Int): Calculadora {
        valores.forEach { resultado *= it }
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main(args: Array<String>) {
    val calc = Calculadora()

    calc.soma(1, 2, 3).multiplica(3).print()
    calc.soma(7, 10).print().limpar().print()

    println(calc.soma(1, 2).obterResultado())
}