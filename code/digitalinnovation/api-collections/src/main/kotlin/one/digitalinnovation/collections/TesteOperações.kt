package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (valores in salarios) {
        println(valores)
    }
    println("----------------------------------------")
    println("Maior que salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${ salarios.minOrNull()}")
    println("Média de salários: ${salarios.average()}")

    val salariosNaiorQue2500 = salarios.filter {
        it >= 2500.0
    }
    println("----------------------------------------")
    salariosNaiorQue2500.forEach {
        println("Salários maiores que R$2.500,00")
        println(it)
    }

    println("-----------------------------------------")
    println("Salários entre R$2.000,00 e 5.000,00:  ${salarios.count{it in 2000.0 .. 5000.0}}")

    println("-----------------------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("-----------------------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any{ it == 500.0 })
}