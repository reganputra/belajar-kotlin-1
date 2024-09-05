
fun main(){
    fun hello(name: String, transform: (String) -> String ): String{
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val upperCase = fun (value: String): String{
        if (value == ""){
            return "UPS"
        }else return value.uppercase()
    }

    println(hello("udin", upperCase))
    println(hello("", upperCase))

//    Anonim Function as param
    println(hello("Gusti", fun(vale: String):String{
        return vale.lowercase()
    }))
}