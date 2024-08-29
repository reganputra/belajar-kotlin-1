
// var mutable (bisa dirubah)
// val immutable (tidak bisa dirubah)

const val STUDY = "Belajar Kotlin"
const val DAY = "Hari pertama"
fun main () {
    println("$STUDY : $DAY")

    val name: String = "Regan"
    val age = 21

    println(name)
    println(age)

    var lastName: String? = null
    lastName = "Putra"

    println(lastName)
    println(lastName.length)


}