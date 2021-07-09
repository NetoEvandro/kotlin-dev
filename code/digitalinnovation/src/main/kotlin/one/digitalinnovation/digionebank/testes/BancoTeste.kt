package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOnebank = Banco(nome = "Digione", numero = 12)

    println("Nome: "+ digiOnebank.nome)
    println("Número: "+ digiOnebank.numero)

    val banco2 = digiOnebank.copy(nome = "Banco2")
    println(banco2.info())

}