package calculadora.digitalinnovation
import kotlin.system.exitProcess
class Calculadora(_operation: Operation) {
    var operation : Operation = _operation
    fun initializeApp(){
        var escolha: Int? = 1
        while (escolha in 1..5) {
            println("_____Bem vindo(a)_____")
            println("1 - Adição")
            println("2 - Subtração")
            println("3 - Multiplicação")
            println("4 - Divisão")
            println("5 - Quadrado")
            println("6 - Sair")
            print("Digite o numero da operaçao que voçê deseja: ")
            escolha = readLine()?.toInt()
            triggerOperations(escolha?: 0);
        }
    }
    private fun pegarNumero(message: String):Double {
        println(message)
        var num = readLine()!! .toDouble()
        return num
    }
    private fun redefinir() {
        println("Opcao invalida, digite um valor correto")
    }

    fun triggerOperations(operations: Int){
        val operationsList = arrayListOf<Int>(1,2,3,4,5)
            if(operationsList.contains(operations)){
            var numberOne: Double = pegarNumero("Digite o primeiro número")
            var numberTwo: Double = pegarNumero("Digite o segundo número")
            println("Qual operação você deseja realizar")
            when (operations) {
                1 -> operation.soma(numberOne, numberTwo)
                2 -> operation.sub(numberOne, numberTwo)
                3 -> operation.multi(numberOne, numberTwo)
                4 -> operation.div(numberOne, numberTwo)
                5 -> operation.quadrado(numberOne)
            }
        } else if(operations == 6){
                exitProcess(-1)
        } else {
                redefinir()
        }
    }
}












