package `23lateInitializedProperties`

//late initialized properties => menunda initialisasi properties
//hanya bisa digunakan di var (mutable data)
class Television{
    lateinit var brand:String //menunda initialisasi
    fun initTv(brand:String){
        this.brand=brand
    }
}

fun main() {
    val tv = Television()
    tv.initTv("Sharp") //harus dipanggil dulu
    println(tv.brand)
}