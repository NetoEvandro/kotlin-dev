fun main() {
    // UMA VEZ INICIADA, VARIÁVEIS DO TIPO "VAL" NÃO PODE MAIS SER ALTERADA.
    val nome: String = "Evandro"

    // JÁ DO TIPO "VAR" PODE SER ALTERADA A QUALQUER MOMENTO NO CÓDIGO
    var idade: Int = 26

    println("Nome: $nome")
    println("Idade: $idade")
    println("--------------")

    // SETANDO NOVO VALOR
    idade = 27

    println("Nova idade: $idade")
}