fun hitung (name: String, vararg values: Int): Int { //paramater yg diberi vararg akan menjadi array,
                                        // varagr harus berada di parameter terkahir
                                        // vararg bisa untuk menambahkan data yg banyak jumlahnya
    var total = 0

    for (value in values){
        total += value
    }

    return  total
}

fun main () {
//    val nilai = arrayOf(20,20,20,20)
    val hasil = hitung("hi", 5,5,5,5)

    println(hasil)
}