//    Method Reference
fun toUpper(value: String): String = value.uppercase()

fun main(){

    val lambdaExp: (String, String) -> String = {firstName: String, lastName: String ->
       val hasil = "$firstName $lastName"
        hasil
    }
    println(lambdaExp("Regan", "Putra"))

//    Lambda it (hanya bisa jalan dengan 1 parameter)
    val lambdaIt: (String) -> String = {
        it.uppercase()
    }
    println(lambdaIt("regan"))

//    Method Reference
    val lambdaMeth: (String) -> String = ::toUpper
    println(lambdaMeth("jokowi"))
}