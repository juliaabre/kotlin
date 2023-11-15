fun procura_digito(vetor:DoubleArray, digito:Double){
    var count:Int = 0
    for (i in vetor){
        if(i == digito){
            count++
            break
        } else {
            continue
        }
    }

    if(count>0){
        println("Elemento ${digito} achado")
    } else {
        println("Elemento ${digito} NÃO achado")
    }
}

fun exibir_vetor(vetor:DoubleArray){
    println("Vetor: ")
    for(i in vetor){
        print("${i} ")
    }
    println()
}

fun main(){
    var vetor = DoubleArray(10)
    var digito:Double
    for (i in 0 until 10){
        println("Informe o valor da ${i}° posição: ")
        vetor[i] = readLine()?.toDoubleOrNull() ?:0.0
    }
    println("Informe um valor: ")
    digito = readLine()?.toDoubleOrNull() ?:0.0

    exibir_vetor(vetor)
    procura_digito(vetor, digito)
    
}
