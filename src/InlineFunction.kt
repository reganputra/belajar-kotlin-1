inline fun heloo(name: () -> String ): String {
    return "Hello ${name()}"
}

fun main(){
    println(heloo { "Gus" })
}
