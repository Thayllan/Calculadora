package calculadora.digitalinnovation

import kotlin.system.exitProcess

class Calculadora {
}
var escolha: Int = 1
fun soma():Double {
    var num1: Double = pegarNumero()
    var num2: Double = pegarNumero()
    var resultado = num1 + num2
    println(resultado)
    return (resultado)
}

fun sub():Double {
    var num1: Double = pegarNumero()
    var num2: Double = pegarNumero()
    var resultado = num1 - num2
    println(resultado)
    return (resultado)
}

fun div():Double {
    var num1: Double = pegarNumero()
    var num2: Double = pegarNumero()
    var resultado = num1 / num2
    println(resultado)
    return (resultado)
}

fun multi():Double {
    var num1: Double = pegarNumero()
    var num2: Double = pegarNumero()
    var resultado = num1 * num2
    println(resultado)
    return (resultado)
}

fun pegarNumero():Double {
    println("Digite um numero:")
    var num = readLine()!! .toDouble()
    return (num)
}

fun quadrado():Double {
    var num1: Double = pegarNumero()
    var resultado = num1 * num1
    println(resultado)
    return (resultado)
}
fun erro (){

    return(println("Insira um valor correto"))
}

fun redefinir (){
    escolha = 1
    return (println("Opcao invalida, digite um valor correto"))
}
fun main() {
    while (escolha in 1..5) {
        println("_____Bem vindo(a)_____")
        println("Qual operação você deseja realizar")
        println("1 - Adição")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Quadrado")
        println("6 - Sair")
        print("Digite o numero da operaçao que voçê deseja: ")
        escolha = readLine()!!.toInt()
        when (escolha) {
            1 -> soma()
            2 -> sub()
            3 -> multi()
            4 -> div()
            5 -> quadrado()
            6 -> exitProcess(-1)
            else -> redefinir()
            }

    }

    }

