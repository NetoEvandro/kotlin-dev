package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val maria = Gerente("Maria", "111.222.333-44", 3000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
