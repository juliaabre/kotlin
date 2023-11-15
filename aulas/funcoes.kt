fun impressao(){
    print("Função sem parâmetro e sem retorno")
}

fun soma(a:Int, b:Int):Int{
    return a+b
}

fun main(){
    impressao()
    var a:Int = 10
    var b:Int = 20
    println(soma(a,b))
    multiplicacao(a,b)
}

fun multiplicacao(a:Int, b:Int){
    println("A multiplicação é ${a*b}")
}