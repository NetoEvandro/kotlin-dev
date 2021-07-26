package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    var i: Int = 0

    values[0] = 50
    values[1] = 40
    values[2] = 30
    values[3] = 20
    values[4] = 10

    println("Tamanho:${values.size}")

    for (valores in values) {
        i += 1
        println("Posição:$i | Valor:$valores")
    }

    //Segunda forma
    println("________________")
    values.forEach {valor ->
        println(valor)
    }

    //Terceira forma
    println("________________")
    for (index in values.indices){
        println(values[index])
    }

    //Quarta forma
    println("________________")
    values.sort() //Ordenando o Array em ordem crescente
    for (valor in values){
        println(valor)
    }
}


