package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val evandro = Pessoa(nome = "Evandro", cpf = "123.456.79-90")

    println("Nome: " + evandro.nome)
    println("Cpf: " + evandro.cpf)

    val joao = Funcionario("Joao", "111.222.333-44", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}