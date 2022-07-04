import calculadora.digitalinnovation.Calculadora
import calculadora.digitalinnovation.Operation

fun main() {
    val operation: Operation = Operation()
    val calculadora : Calculadora = Calculadora(operation)
    calculadora.initializeApp()
}
