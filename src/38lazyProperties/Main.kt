package `38lazyProperties`

//lazy => std lib yang disediakan agar properties baru diinisialisasi ketika diakses
class Lazy{
    val name:String by lazy {
        println("Lazy call")
        "Adi"
    }
}

fun main() {
    val lazy = Lazy()
    println(lazy.name)
    println(lazy.name)
    println(lazy.name)
}