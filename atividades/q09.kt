fun horasParaMinutos(horas:Float){
    var hora:Int = horas.toInt()
    var min:Float = (horas - hora)*60
    println("Horas: ${hora} e Minutos: ${min}")
}

fun minutosParaHoras(min:Float){
    var horas:Int = (min/60).toInt()
    var minutos:Float = ((min/60) - horas)*60
    println("Horas: ${horas} e Minutos: ${minutos}")
}

fun main(){
    var horas:Float = 108.4f
    var min:Float = 140.5f
    horasParaMinutos(horas)
    minutosParaHoras(min)
}