package `11functionOverriding`

//function overriding => membuat ulang function yang sudah ada di parent class
//secara standart, function di class adalah final, agar bisa di overriding menggunakan kata kunci open

open class Buah(val nama:String) {
    open fun getRasa(){ //agar bisa di overriding
        println("Enak")
    }
}

open class Mangga(nama:String): Buah(nama){
    final override fun getRasa(){
        // standart override fun adalah open, agar tidak bisa dioverride ke kelas lagi tambahkan final
        // function overriding
        println("Manis")
    }
}

//class ManggaMadu(nama:String):Mangga(nama){
//    override fun getRasa(){
//        // standart override fun adalah open, agar tidak bisa dioverride ke kelas lagi tambahkan final
//        // function overriding
//        println("Manis")
//    }
//}

fun main() {
    val mangga = Buah("mangga")
    mangga.getRasa()

    val madu = Mangga("madu")
    madu.getRasa()
}