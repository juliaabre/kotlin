fun print_matriz(matriz:Array<Array<Int>>,linhas:Int, colunas:Int){
    for(i in 0 until linhas){
        for (j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }
}

fun main(){
    val linhas:Int = 3
    val colunas:Int = 4

    val matriz:Array<Array<Int>> = Array(linhas){Array(colunas) {0}}
    var digito = -1

    println("Antes:")
    print_matriz(matriz,linhas, colunas)

    for(i in 0 until linhas){
        for (j in 0 until colunas){
            matriz[i][j] = ++digito  //pré incrementa - digito++ pos incrementa
        }
    }

    println("Depois:")
    for(linhas in matriz){ //Outra forma de printar a matriz
        for (valor in linhas){
            print("${valor} ")
        }
        println()
    }

    println("Quantidade de linhas: ${matriz.size}")
    println("Quantidade de colunas: ${matriz[0].size}")
}