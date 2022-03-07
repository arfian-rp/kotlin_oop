package `33singletonObject`

//singleton object => object yang hanya dibuat sekali
//singleton object tidak memiliki constructor
class Application(val name:String){
    //inner object => singleton object tidak dapat mengakses properties atau function di outer class
    object Utilities {
        val name: String = "My Utilities"
        fun toUpper(value: String): String {
            return value.uppercase()
        }
        fun hallo(name:String){
            println("Hello $name")
        }
    }
}

fun main() {
    println(Application.Utilities.name)
    println(Application.Utilities.toUpper("hendrich"))
    Application.Utilities.hallo("Yuda")
}