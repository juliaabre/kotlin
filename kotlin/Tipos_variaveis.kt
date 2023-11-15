fun main() {
    var x:Int //Variavel Mutavel
    val y:Int //Variavel Imutavel
    var a:Float = 19.5f
    var b:Long = 15497645649
    var c:Short = 1
    var d:String = "Julia"
    var e:Char = 'j'
    var f:Byte = 0b1010
    var g:Byte = 0xf
    var h:UInt = 12u

    //Capacidade das variaveis
    println("ULong Maximo: ${ULong.MAX_VALUE} Ulong Minimo: ${ULong.MIN_VALUE}")
    println("UInt Maximo: ${UInt.MAX_VALUE} UInt Minimo: ${UInt.MIN_VALUE}")
    println("Long Maximo: ${Long.MAX_VALUE} long Minimo: ${Long.MIN_VALUE}")
    println("Int Maximo: ${Int.MAX_VALUE} Int Minimo: ${Int.MIN_VALUE}")
}