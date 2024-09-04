

fun main(){
    fun hello(name: String, transform: (String) -> String ): String{
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.uppercase()}
    val lambdaLower = {value: String -> value.lowercase()}
    println(hello("regan", lambdaUpper))
    println(hello("REGAN", lambdaLower))

//    Trailing Lambda
    val reswan1 = hello("agus", {value: String -> value.uppercase()})
    println(reswan1)
    val reswan2 = hello("AGUS") {value: String -> value.lowercase()}
    println(reswan2)
}