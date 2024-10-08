
fun main (){
     fun factorialLoop(value: Int): Int{
         var start = 1
         for (i in value downTo 1){
             start *= i
         }
         return start
     }
    println(factorialLoop(5))

    fun factorialRecursive(value: Int): Int{
        return when(value){
            1 ->1
            else -> value * factorialRecursive(value - 1)
        }
    }
    println(factorialRecursive(5))
}