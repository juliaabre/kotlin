fun main(){
    //val n = readLine()
    var str = readln() ?: -1
    var str2 = readlnOrNull()
    var num = readlnOrNull()?.toInt() ?:0
    var num1 = readlnOrNull()?.toDouble() ?: 0.0
    var num2 = readlnOrNull()?.toFloat() ?: 0f
    var num3 = readlnOrNull()?.toBoolean() ?: false

    println("-> ${str}")
    println("-> ${str2}")
    println("Tipo Int ${num}")
    println("Tipo Double ${num1}")
    println("Tipo Float ${num2}")
    println("Tipo Boolean ${num3}")

}