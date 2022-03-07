package `15anyClass`

//Any Class => superclass untuk semua class yang kita buat di Kotlin
class Laptop(val merk:String) //=> class Laptop:Any()

fun main() {
    val laptopSaya = Laptop("MSI")
    println(laptopSaya.toString()) //function toString() adalah salah satu function di Any class
}