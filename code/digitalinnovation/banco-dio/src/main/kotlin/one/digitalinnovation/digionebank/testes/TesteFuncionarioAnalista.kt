package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista("João", "111.222.333-44", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

