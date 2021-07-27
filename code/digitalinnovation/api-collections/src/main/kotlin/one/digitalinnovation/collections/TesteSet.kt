package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João", 2000.0, "CLT")
    val pedro = Funcionario ("Pedro", 1500.0, "PJ")
    val maria = Funcionario ("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    val funcionarios2 = setOf(maria)

    //União dos conjuntos
    val resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach{
        println(it)
    }

    println("-----------------")
    //Subtração dos conjuntos
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubctract = funcionario3.subtract(funcionarios2)
    resultSubctract.forEach{
        println(it)
    }
    //Exibe o que tem em comum nos dois conjuntos
    val resultIntersect = funcionario3.intersect(funcionarios2)
    resultIntersect.forEach{
        println(it)
    }
}