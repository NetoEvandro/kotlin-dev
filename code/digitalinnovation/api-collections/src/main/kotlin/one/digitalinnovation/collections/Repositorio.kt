package one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    //Criando um novo elemento na map
    fun create(id: String, value: T) {
        map[id] = value
    }
    //Removendo pelo Id
    fun delete(id: String) = map.remove(id)

    //Busca pelo Id
    fun findById(id: String) = map[id]

    //Listar todos os valores
    fun findAll() = map.values

}