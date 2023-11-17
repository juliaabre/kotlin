import kotlin.math.sqrt

fun main() {
    val numerador:Int = 10
    val denominador:Int = 1

    try {
        val divisao:Int = (numerador/denominador)
        println("A divisao é ${divisao}")
    } catch (e: ArithmeticException){
        println("Erro: não existe divisão por zero.")
    }

    val numero:Float = -25f
    try {
        val raiz = sqrt(numero)
        if(numero < 0){
            throw IllegalArgumentException()
        }
        println("Resultado: ${raiz}")

    } catch (e: IllegalArgumentException){
        println("Não existe raiz de numeros negativos.")
    }
}