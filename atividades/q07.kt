fun primo(numero:Int){
    var divisor:Int = numero - 1
    var divisao:Int
    var count:Int = 0

    //Divisões
    while (count < 1 && divisor > 1){
        divisao = numero % (divisor)
        if (divisao == 0){
            count++
            break
        }
        divisor--
    }

    //Exibir mensagem
    if (count==0){
        println("O numero ${numero} é primo.")
    } else {
        println("O numero ${numero} não é primo.")
    }
}

fun main(){
    println("Informe um número: ")
    var numero:Int = readLine()?.toIntOrNull() ?: 0

    primo(numero)
}