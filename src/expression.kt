
fun main () {

//    If-else
    var nilaiUjian = "A"
//
//    if (nilaiUjian > 90) {
//        println("Nilai anda diatas KKM!")
//    } else if (nilaiUjian > 75) {
//        println("Nilai anda pas KKM")
//    } else {
//        println("Anda tidak lulus")
//    }

//    When
//    when (nilaiUjian){
//        'A'-> {
//            println("Perfect")
//        }
//        'B'-> {
//            println("Good")
//        }
//        'C'-> {
//            println("Enough")
//        }
//        else->{
//            println("You're Cooked!")
//        }
//    }
//    when(nilaiUjian){
//        'A', 'B', 'C'->{
//            println("Pass")
//        }
//        else->{
//            println("Dumb!")
//        }
//    }

//    val koleksiNilai: Array<String> = arrayOf("A", "B", "C")
//    when(nilaiUjian){
//        in koleksiNilai-> println("Lulus ges")
//        !in koleksiNilai-> println("gosong chef")
//    }

//    when(nilaiUjian){
//        is String-> println("Ini String")
//        !is String-> println("Bukan String")
//    }

    val examValue = 90
    when {
        examValue > 80 -> println("Best")
        examValue > 75 -> println("Good")
        else-> println("Fail")
    }
}