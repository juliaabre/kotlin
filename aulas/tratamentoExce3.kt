import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){
    val arquivo = File("C:\\Users\\Júlia\\Documents\\Kotlin\\Conceitos_iniciais\\src\\main\\aulas\\passa-a-passo.txt")
    try {
        Scanner(arquivo).use{l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }

    } catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo.")
    }

}


fun main(){
    ler_arquivo()
}