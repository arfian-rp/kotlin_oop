package `24interface`

//interface => blueprint
//interface tidak bisa langsung sebagai object
//semua function dan properties di interface adalah abstract
interface Interaction{
    val name:String
    fun sayHello(name:String):Unit

    fun sayHello_TidakWajib(){
        //Concrete function interface => pengecualian kelas yg tidak abstract (tdk wajib dioverride)
        println("Hello")
    }
}

interface Go: Interaction{ //inheritance tanpa interface
    fun go(){
        println("Go!")
    }
}

open class Contoh

//Konflik di Interface
interface MoveA{
    fun move(){
        println("move A")
    }
}interface MoveB{
    fun move(){
        println("move B")
    }
}

class Human(override val name: String): Contoh(), Interaction, Go, MoveA, MoveB{ //multiple Inheritance
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
    override fun move() {
        //Memperbaiki konflik di Interface
        super <MoveA>.move()
        super <MoveB>.move()
    }
}

fun main() {
    val human = Human("Rudy")
    human.sayHello("Tyson")
    human.sayHello_TidakWajib()
    human.go()
}