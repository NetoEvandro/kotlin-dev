class Aula04_Pessoa(
    val nome: String,
    val idade: Int
)

fun main() {
    //INSTANCIANDO A CLASSE PESSOA
    val pessoa: Aula04_Pessoa = Aula04_Pessoa("Evandro", 26)
    val pessoa2: Aula04_Pessoa = Aula04_Pessoa("José", 50)

    println("Pessoa 1: ${pessoa.nome}")
    println("Pessoa 2: ${pessoa2.nome}")
}