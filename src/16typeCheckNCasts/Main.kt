package `16typeCheckNCasts`

class Laptop(val name:String){
    fun getMerk():String = "Laptop merk ${this.name}"
}

fun printObject(any:Any){
    //menerima parameter dalam bentuk apapun
    if(any is Laptop){ //apakh obj dari class Laptop
        //apabila true secara otomaris any menjadi object Laptop (bisa mengakses properties)
        println(any.getMerk())
    }else if(any is String){
        println(any.uppercase())
    }else{
        println(any)
    }
}

//Unsafe Casts
fun printStringNoSafe(any:Any){
    val value = any as String //memaksa
    println(value)
}

//Safe Nullable Casts
fun printStringSafe(any:Any){
    val value = any as? String //apabila gagal maka diubah jadi null
    println(value)
}

fun main() {
    //type check & casts => pengecekan tipe data
    printObject(1)
    printObject("hello")
    printObject(Laptop("MSI"))

    printStringNoSafe("Hello")
    //printStringNoSafe(1) ERROR ClassCastException

    printStringSafe("Jefry")
    printStringSafe(1) //tidak error tapi menjadi null
}