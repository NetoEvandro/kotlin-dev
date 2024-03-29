package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João", 2000.0, "CLT")
    val pedro = Funcionario ("Pedro", 1500.0, "PJ")
    val maria = Funcionario ("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
    }
    //Testando procurar funcionario na list pelo nome
    println("-------------------")
    println(funcionarios.find { it.nome == "Maria"})

    println("-------------------")
    //Ordedando obj funcionario pelo salário
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}

    println("-------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)}
}

