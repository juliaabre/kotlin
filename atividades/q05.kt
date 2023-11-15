fun exibir_matriz(matriz:Array<Array<Float>>,linhas:Int, colunas:Int){
    for(i in 0 until linhas){
        for (j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }
}

fun main(){
    val linhas:Int = 4
    val colunas:Int = 4

    val matriz:Array<Array<Float>> = Array(linhas){Array(colunas) {0f}}
    var digito:Float

    for(i in 0 until linhas){
        for (j in 0 until colunas){
            println("Insira o valor da posição [${i}][${j}]:")
            matriz[i][j] = readLine()?.toFloatOrNull() ?: 0f
        }
    }

    println("Matriz:")
    exibir_matriz(matriz, linhas, colunas)

    println("Quantidade de linhas: ${matriz.size}")
    println("Quantidade de colunas: ${matriz[0].size}")
}