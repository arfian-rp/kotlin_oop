package `18equals`

class Laptop(val merk:String)

class Hp(val merk:String){
    //di Kotlin semua object bnisa dibandingkan menggunakan operasi == atau !=
    //saat menggunakan == atau != sebenarnya kotlin menjalankan function equals() milik
    //untuk mengubah cara membandingkannya, kita bisa mengoverride function equals milik Any
    override fun equals(other: Any?): Boolean { //MEMODIFIKASI equals()
        return when(other){
            is Hp->other.merk==this.merk
            else->false
        }
    }
}

fun main() {
    val laptop1 = Laptop("MSI")
    val laptop2 = Laptop("MSI")
    println(laptop1==laptop2) //false, karena beda object
    println(laptop1.equals(laptop2)) //false, karena beda object

    val hp1 = Hp("Iphone")
    val hp2 = Hp("Iphone")
    println(hp1==hp2) //true, karena function equals() sdh dimodifikasi
    println(hp1.equals(hp2)) //true, karena function equals() sdh dimodifikasi
}