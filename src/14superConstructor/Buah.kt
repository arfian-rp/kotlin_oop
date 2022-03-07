package `14superConstructor`

//super constructor => mengakses constructor parent
//hanya bisa dipanggil di constructor class child
open class Buah(val name:String, val harga:Long) {
    constructor(name:String):this(name,0L) //mengakses primary constructor
}

class Mangga:Buah{
    constructor():super("Mangga",1_000L) //mengakses constructor parent
}

fun main() {
    val m1 = Mangga()
    println(m1.name)
    println(m1.harga)
}