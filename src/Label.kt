fun labelBreakk(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i>5) break@loopI
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun main(){
   fun test(name: String, opetaion: (String) -> Unit): Unit = opetaion(name)

    test("ho") test@{
        if (it == "") {
            return@test
        } else println("Gus")
    }
}