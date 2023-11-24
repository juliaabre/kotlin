import kotlin.math.sqrt

fun main(){
    try {
        var s:String? = null
        s = "Julia"
        println("O tamanho da String é: ${s!!.length}")

        var a:Int = 100/1
        println("O resultado da divisão é ${a}")

        var b:Double = 9.0
        var raiz:Double = sqrt(b)
        if (b < 0){
            throw IllegalArgumentException()

        }
        var d:Int = 2
        if(d == 1){
            throw Exception("O valor não pode ser 1.")
        }
    } catch (e: NullPointerException){
        println("A variavel esta vazia.")
    } catch (e: ArithmeticException){
        println("Não existe divisão por zero.")
    } catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo")
    } catch (e: Exception){
        println("Exceção mais geral: ")
        println(e.message)
    } finally {
        println("Executando o finally")
    }
}