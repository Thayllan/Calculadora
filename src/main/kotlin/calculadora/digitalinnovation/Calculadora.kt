package calculadora.digitalinnovation

class Calculadora {
    var escolha: Int =0
}


fun main() {

    println("_____Bem vindo(a)_____")
    println("Qual operação você deseja realizar")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    print("Digite o numero da operaçao que voçê deseja: ")
    val escolha = readLine()!!.toInt()
   if(escolha in 1 .. 4){
      when (escolha){
          1 -> soma()
          2 -> sub()
          3 -> multi()
          4 -> div()
      }
   } else{
       println("Escolha um valor de 0 até 4")
   }

}

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

