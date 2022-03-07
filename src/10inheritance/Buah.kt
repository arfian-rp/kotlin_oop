package `10inheritance`

//inheritance => kemampuan menurunkan sebuah class ke class lain
//di kotlin ada parent(cuma 1) dan child(banyak)
//secara standart, class yang dibuat adalah final, agar bisa diwariskan, kita harus menggunakan kata kunci open


open class Buah(val nama:String) { //bisa diwariskan
    fun getRasaBuah(){
        println("Enak")
    }
}

class Mangga(nama:String): Buah(nama){ //karena ada primary constructor di parent maka wajib memasukkan primary constructor
    fun getRasaMangga(){
        println("Manis")
    }
}

fun main() {
    val mangga = Buah("mangga")
    mangga.getRasaBuah()

    val madu = Mangga("madu")
    madu.getRasaBuah() //dapat mengakses function di parent
    madu.getRasaMangga()
}