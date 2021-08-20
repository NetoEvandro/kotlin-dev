fun main() {
    println(max(10, 5))
    println(max1(10, 20))
}

// CORPO DE BLOCO
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// CORPO DE EXPRESSÃO
fun max1(a: Int, b: Int): Int = if (a > b) a else b
