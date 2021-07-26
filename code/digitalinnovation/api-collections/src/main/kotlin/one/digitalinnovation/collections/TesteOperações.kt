package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (valores in salarios) {
        println(valores)
    }
    println("--------------------")
    println("Maior que salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${ salarios.minOrNull()}")
    println("Média de salários: ${salarios.average()}")

    val salariosNaiorQue2500 = salarios.filter {
        it >= 2500.0
    }
    println("--------------------")
    salariosNaiorQue2500.forEach {
        println("Salários maiores que R$2.500,00")
        println(it)
    }
}