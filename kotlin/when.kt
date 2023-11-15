fun main(){
    var cargo:String = "gerente"
    when(cargo){
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coordenador" -> println(3000f)
        "Analista" -> println(2400f)
        "Estagiario" -> println(1600f)
        else -> println("Cargo não identificado")
    }
}