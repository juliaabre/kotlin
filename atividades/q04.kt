fun main() {
    var vetor = Array(10, {""})
    //Entrada de Valores
    for (i in 0 until vetor.size){
        println("Informe um nome: ")
        vetor[i] = readLine() ?: ""
    }
    //Exibir valores
    for (i in 0 until vetor.size){
        print("[${i}]${vetor[i]} ")
    }

}