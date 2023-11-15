fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for(i in 0 .. (numeros.size-1)){
        print("${numeros[i]} ")
    }
}

fun vetor_inteiros2(){
    var n = Array(10, {i->i})
    for(i in n){
        print("${n[i]} ")
    }
}

fun vetor2(){
    var n = Array(size = 10, {i->i})
    for(i in n){
        print("${n[i]} ")
    }
}

fun main(){
    vetor_inteiros()
    print("\n")
    vetor2()
    print("\n")
    vetor_inteiros2()
}