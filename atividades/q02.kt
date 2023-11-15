import kotlin.system.exitProcess

fun calcula_media(notas: FloatArray):Float{
    for(n in notas){
        if (n > 10 || n < 0){
            print("Nota inexistente")
            exitProcess(1)  //função para encerrar a execução do programa
        }
    }

    var media:Float = (notas[0] + notas[1] + notas[2]+ notas[3])/4

    return media
}

fun main(){
    var notas = floatArrayOf(7.5f, 10f,8f,7.2f)

    var media = calcula_media(notas)

    if(media >= 7.0 ){
        println("Aluno APROVADO! Media = ${media}")
    } else if (media >= 4 && media <7){
        println("Aluno na RECUPERAÇÃO. Media = ${media}")
    } else{
        println("Aluno REPROVADO. Media = ${media}")
    }

}