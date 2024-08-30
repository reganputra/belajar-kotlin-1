
fun main(){
     var array = arrayOf("Dedek", "Simon", "Edo")

//    var total = 0
//    for (name in arr){
//        println(name)
//        total++
//    }
//    println("Total nama = $total")

    for (i in 1..10){
        println("ini angka ke = $i")
    }

    for (i in 20 downTo 0 step 2){
        println(i)
    }

    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){
        println(array.get(i))
    }
}