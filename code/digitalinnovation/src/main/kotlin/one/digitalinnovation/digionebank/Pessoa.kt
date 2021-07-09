package one.digitalinnovation.digionebank

class Pessoa {
    val nome:String = "Evandro"
    val cpf:String = "123.456.78-90"
}

fun main() {
    var pessoa = Pessoa()

    println("Nome: "+ pessoa.nome)
    println("Cpf: "+ pessoa.cpf)
}