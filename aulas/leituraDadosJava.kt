import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System. `in`)
    println("Informe um número inteiro: ")
    val num = scanner.nextInt()
    println("Soma de ${num} + 1 = ${num+1}")
}

fun ler_float(){
    val scanner = Scanner(System. `in`)
    println("Informe um número float: ")
    val num = scanner.nextFloat()
    println("Soma de ${num} + 1 = ${num+1}")
}

fun ler_double(){
    val scanner = Scanner(System. `in`)
    println("Informe um número inteiro: ")
    val num = scanner.nextDouble()
    println("Soma de ${num} + 1 = ${num+1}")
}

fun ler_string(){
    val scanner = Scanner(System. `in`)
    println("Informe um número inteiro: ")
    val num = scanner.next()
    println("Soma de ${num} + 1 não é ${num+1}")
}

fun main() {
    ler_int()
    ler_double()
    ler_float()
    ler_string()

}