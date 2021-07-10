package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val evandro = Pessoa(nome = "Evandro", cpf = "123.456.79-90")

    println("Nome: " + evandro.nome)
    println("Cpf: " + evandro.cpf)

}