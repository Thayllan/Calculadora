package calculadora.digitalinnovation

class Operation(){
    fun soma(num1: Double, num2: Double):Double {
        var resultado = num1 + num2
        println(resultado)
        return (resultado)
    }

    fun sub(num1: Double, num2: Double):Double {
        var resultado = num1 - num2
        println(resultado)
        return (resultado)
    }

    fun div(num1: Double, num2: Double):Double {
        var resultado = num1 / num2
        println(resultado)
        return (resultado)
    }

    fun multi(num1: Double, num2: Double):Double {
        var resultado = num1 * num2
        println(resultado)
        return (resultado)
    }

    fun quadrado(num1: Double):Double {
        var resultado = num1 * num1
        println(resultado)
        return (resultado)
    }
}