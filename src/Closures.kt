
fun main(){
    var counter = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda")
        counter++
    }

    val anonim = fun() {
        println("Anonim")
        counter++
    }

    fun incel(){
        println("Function")
        counter++
    }

    lambdaIncrement()
    anonim()
    incel()
    lambdaIncrement()
    anonim()
    incel()
    println(counter)
}