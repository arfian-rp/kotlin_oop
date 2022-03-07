package `21abstractPropertiesNFunction`

//properties dfaan function yang bersit abstract, wajib dibuat ulang di class child
abstract class Animal{
    abstract val name:String //abstract harus kosong
    abstract fun run()
}

class Cat:Animal(){
    override val name: String = "Cat"
    override fun run() {
        println("Cat run!")
    }
}

fun main() {
    val oren = Cat()
    println(oren.name)
    oren.run()
}
