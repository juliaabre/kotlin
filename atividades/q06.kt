fun numeros_reais(){
    println("Números reais contêm...")
    numeros_racionais()
    println("Essa é a ordem hierárquica de classificação dos números.")
}

fun numeros_racionais(){
    println("os números racionais que contêm...")
    numeros_inteiros()
}

fun numeros_inteiros(){
    println("os números inteiros que contêm...")
    numeros_naturais()
}

fun numeros_naturais(){
    println("os números naturais!")
}

fun main(){
    numeros_reais()
}