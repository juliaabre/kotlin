fun main(){
    for(i in 1 .. 10){ //Ordem Crescente
        print("${i} ")
    }

    print("\n")

    for(i in 10 downTo 1){ //Ordem Decrescente
        print("${i} ")
    }

    print("\n")

    var str = "Criação de Aplicativos Android"
    for(i in str){ //Percorrer a string
        print("${i} ")
    }

    print("\n")

    for(i in 1 .. 20 step 2){ //Ordem Crescente pulando de dois em dois
        print("${i} ")
    }
}
