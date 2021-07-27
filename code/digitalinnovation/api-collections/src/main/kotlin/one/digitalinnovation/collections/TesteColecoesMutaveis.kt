package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    //Lista mutável
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
    }
    println("Tamanho: "+funcionarios.size)

    //Adicionando  um item na lista
    funcionarios.add(pedro)
    funcionarios.forEach{
        println(it)
    }
    println("Tamanho: "+funcionarios.size)

    //Removendo um item da lista
    funcionarios.remove(joao)
    funcionarios.forEach{
        println(it)
    }
    println("Tamanho: "+funcionarios.size)

    println("----- SET -----")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{
        println(it)
    }

    println("----- ADD -----")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it) }

    println("--- DELETE ---")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}