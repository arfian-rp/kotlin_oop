package `34companionObject`

//companion object => kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
//companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama classnya
class Application(val name:String){
    companion object{
        fun hello(name:String){
            println("Hello $name")
        }
    }
}

fun main() {
    Application.hello("Tyson")
    Application.Companion.hello("Yudi")
}