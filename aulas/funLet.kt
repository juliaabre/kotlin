fun main(){
    var str:String? = null
    str = "Maria"
    if(str != null){
        println("Caiu no if")
    }

    str?.let {
        println("Caiu na função let")
    }

}