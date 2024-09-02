fun hitung(a: Int, b:Int): Int{
   val sum = a+b
   return sum
}
fun bagi(a:Int, b:Int): Int {
   if (b == 0){
      return 0
   } else {
      val div = a/b
      return div
   }
}
fun main(){
   println(hitung(69,69))

   val hasil = hitung(1920, 1740)
   println(hasil)


   val hasil1 = bagi(180, 20)
   println(hasil1)
}