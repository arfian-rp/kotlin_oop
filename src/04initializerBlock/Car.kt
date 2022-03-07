package `04initializerBlock`

class Car (merk:String, roda:Int){
    var merkMobil = merk
    var rodaMobil = roda
    init{
        //initializer block => blok kode yang dieksekusi ketika constructor dipanggil
        println("initializer Block")
        //dianjurkan menjalankan kode yang sederhana
    }
}

fun main() {
    val toyota = Car("toyota",4)
    println(toyota.merkMobil)
}