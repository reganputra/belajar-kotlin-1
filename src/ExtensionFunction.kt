fun String.hello(): String = "Hallo $this"

fun String.printHello(): Unit = println("Hello $this")

fun main (){
    val name = "Robin"
    println(name.hello())

    name.printHello()

    "Sunday".printHello()
}