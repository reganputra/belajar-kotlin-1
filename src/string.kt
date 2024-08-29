fun main () {
    var firstName: String = "Regan"
    var lastName: String = "Putra Ramadhan"

    var alamat: String = """
    |Indonesia,
    |Jawa Timur,
    |Kota Surabaya,
    |Jalan Hayam Wuruk Baru 2 no 23,
    |RW 11
    """.trimMargin()

    var fullName: String = "$firstName  $lastName"

    var desc: String = "$fullName panjang namanya adalah = ${fullName.length}"
//    println(firstName)
//    println(lastName)
    println(fullName)
    println(desc)
}