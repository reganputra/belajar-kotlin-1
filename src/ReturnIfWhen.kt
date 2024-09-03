
fun main(){

    fun hello(name: String = ""): String{
//        return when
        return when(name){
            "" -> "Helloow!"
            else -> "Hi! $name"
        }
//        return if
//        return if (name == ""){
//             "Heloo!"
//        } else {
//             "Hello $name"
//        }
    }

//    return when

    println(hello())
    println(hello("Regan"))
}