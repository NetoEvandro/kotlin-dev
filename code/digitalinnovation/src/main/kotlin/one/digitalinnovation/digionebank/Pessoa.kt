package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Evandro"
    var cpf: String = "123.456.78-90"
    private set

    constructor()
    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val evandro = Pessoa()

    println("Nome: " + evandro.nome)
    println("Cpf: " + evandro.cpf)
    println(evandro.pessoaInfo())
}