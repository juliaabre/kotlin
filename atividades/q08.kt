fun fibonacci(){
    var numeroAnterior:Int = 1
    var numeroProxino:Int = 1
    var numeroAtual:Int
    print("${numeroAnterior}..${numeroProxino}..")
    for(i in 0 until 6){
        numeroAtual = numeroAnterior + numeroProxino
        print("${numeroAtual}..")
        numeroAnterior = numeroProxino
        numeroProxino = numeroAtual
    }
}

fun main(){
    println("Sequência de Fibonacci: ")
    fibonacci()

}