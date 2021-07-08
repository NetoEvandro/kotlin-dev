import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    var n1: Float = 0f
    var n2: Float = 0f

    val input = Scanner(System.`in`)
    println("|--------------------------------|")
    println("|------ CALCULADORA KOTLIN ------|")
    println("| 1- ADIÇÃO ---------------------|")
    println("| 2- SUBTRAÇÃO ------------------|")
    println("| 3- MULTIPLICAÇÃO --------------|")
    println("| 4- DIVISÃO --------------------|")
    println("| 5  POTÊNCIAÇÃO ----------------|")
    println("| 6- RAIZ QUADRADA --------------|")
    println("| 7- PORCENTAGEM ----------------|")
    println("| 8- RESTO DA DIVISÃO -----------|")
    println("| 9- SAIR -----------------------|")
    println("|------- ESCOLHA A OPÇÃO --------|")
    print("DIGITE AQUI: ")
    val opcao = input.nextInt()

    when (opcao) {
        1 -> {
            println("|--------------------------------|")
            println("|------------ ADIÇÃO ------------|")
            print("Digite o primeiro número:")
            n1 = input.nextFloat()
            print("Digite o segundo número:")
            n2 = input.nextFloat()
            val soma = n1 + n2
            println("| RESULTADO: --------------------|")
            println(" $n1 + $n2 = $soma")
            println("|--------------------------------|")
        }
        2 -> {
            println("|--------------------------------|")
            println("|----------- SUBTRAÇÃO ----------|")
            print("Digite o primeiro número:")
            n1 = input.nextFloat()
            print("Digite o segundo número:")
            n2 = input.nextFloat()
            val sub = n1 - n2
            println("| RESULTADO: --------------------|")
            println(" $n1 - $n2 = $sub")
            println("|--------------------------------|")

        }
        3 -> {
            println("|--------------------------------|")
            println("|--------- MULTIPLICAÇÃO --------|")
            print("Digite o primeiro número:")
            n1 = input.nextFloat()
            print("Digite o segundo número:")
            n2 = input.nextFloat()
            val mult = n1 * n2
            println("| RESULTADO: --------------------|")
            println(" $n1 * $n2 = $mult")
            println("|--------------------------------|")
        }
        4 -> {
            println("|--------------------------------|")
            println("|------------ DIVISÃO -----------|")
            print("Digite o primeiro número:")
            n1 = input.nextFloat()
            print("Digite o segundo número:")
            n2 = input.nextFloat()
            val div = n1 / n2
            println("| RESULTADO: --------------------|")
            println(" $n1 / $n2 = $div")
            println("|--------------------------------|")
        }
        5 -> {
            println("|--------------------------------|")
            println("|---------- POTÊNCIAÇÃO ---------|")
            print("Digite o numero base:")
            n1 = input.nextFloat()
            print("Digite o numero expoente:")
            n2 = input.nextFloat()
            val pot = n1.pow(n2)
            println("| RESULTADO: --------------------|")
            println(" $n1 elevado a $n2 = $pot")
            println("|--------------------------------|")
        }
        6 -> {
            println("|--------------------------------|")
            println("|--------- RAIZ QUADRADA --------|")
            print("Digite o numero:")
            n1 = input.nextFloat()
            val raiz = sqrt(n1)
            println("| RESULTADO: --------------------|")
            println(" A raiz quadrada de $n1 é: $raiz ")
            println("|--------------------------------|")
        }
        7 -> {
            println("|--------------------------------|")
            println("|---------- PORCENTAGEM ---------|")
            print("Digite o numero:")
            n1 = input.nextFloat()
            print("Digite a % que deseja:")
            n2 = input.nextFloat()
            val porc = (n1 / 100) * n2
            println("| RESULTADO: --------------------|")
            println(" $n2% de $n1 é: $porc")
            println("|--------------------------------|")
        }
        8 -> {
            println("|--------------------------------|")
            println("|------- RESTO DA DIVISÃO -------|")
            print("Digite o primeiro número:")
            n1 = input.nextFloat()
            print("Digite o segundo número:")
            n2 = input.nextFloat()
            val rDiv = n1 % n2
            println("| RESULTADO: --------------------|")
            println("| O resto da divisão é: $rDiv")
            println("|--------------------------------|")
        }
        9 -> {
            println("|--------------------------------|")
            println("|------------ SAINDO ------------|")
            println("|--------------------------------|")
            System.exit(1)
        }
        else -> {
            println("|------------- ERRO! ------------|")
            println("|    DIGITE UM NÚMERO VÁLIDO.    |")
            println("|--------------------------------|")
            println("| 1- PARA REINICIAR OU QUALQUER  |")
            println("|     OUTRO NÚMERO PARA SAIR.    |")
            println("|--------------------------------|")
            print("DIGITE AQUI: ")
            val erro = input.nextInt()
            retorno(erro)
        }

    }
    println("|--------------------------------|")
    println("| 1- PARA REINICIAR OU QUALQUER  |")
    println("|     OUTRO NÚMERO PARA SAIR.    |")
    println("|--------------------------------|")
    print("DIGITE AQUI: ")
    val reinicar = input.nextInt()
    retorno(reinicar)
}
fun retorno(opcao:Int):Int {
    if (opcao == 1) {
        println("|--------------------------------|")
        println("|---------- REINICIANDO... ------|")
        main()
    } else {
        println("|--------------------------------|")
        println("|------------ SAINDO ------------|")
        println("|--------------------------------|")
        System.exit(1)
    }
    return opcao
}


