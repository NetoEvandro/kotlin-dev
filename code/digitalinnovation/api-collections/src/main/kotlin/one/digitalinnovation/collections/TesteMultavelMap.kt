package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João", 2000.0, "CLT")
    val pedro = Funcionario ("Pedro", 1500.0, "PJ")
    val maria = Funcionario ("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    //Adicionando Funcionario dentro do repositorio map
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    //Buscando pelo ID = nome
    println(repositorio.findById(joao.nome))

    //Listando todos os itens do map
    println("----- ALL -----")
    repositorio.findAll().forEach{ println(it)}

    //Excluindo pelo Id = nome
    println("----- DEL -----")
    repositorio.delete(maria.nome)
    repositorio.findAll().forEach { println(it) }
}