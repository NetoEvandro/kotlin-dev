fun main() {
    val nome = "Evandro"

    //CONCATENAÇÃO DE STRINGS COM VARIÁVEL FEITA NO JAVA
    println("Hello, "+ nome +" !")

    //STRING TEMPLATE DO KOTLIN
    println("Hello, $nome!")

    //DESCONSIDERANDO A STRING TEMPLATE
    println("Hello, \$nome!")

    //EXEMPLO COM EXPRESSÕES
    println("A soma é: ${soma(10,20)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}