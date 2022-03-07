package `17toString`

class Laptop(val merk:String)

class Hp(val merk:String){
    //saat menggunakan println(obj) sebenarnya kotlin menjalankan function toString() milik
    //untuk mengubah output, kita bisa mengoverride function toString() milik Any
    override fun toString(): String {
        return "Ini Hp merk ${this.merk}"
    }
}

fun main() {
    val laptop = Laptop("MSI")
    println(laptop) //17toString.Laptop@7cca494b, (default)
    println(laptop.toString()) //17toString.Laptop@7cca494b, (default)

    val hp = Hp("Iphone")
    println(hp) //Ini Hp merk Iphone, karena function toString() sdh dimodifikasi
    println(hp.toString()) //Ini Hp merk Iphone, karena function toString() sdh dimodifikasi
}