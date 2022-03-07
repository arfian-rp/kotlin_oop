package `07function`

class Person(var name:String) {
    fun sayHello(person:Person){
        println("Hello, ${person.name}")
    }
}

fun main() {
    val ronaldo = Person("ronaldo ")
    val messi = Person("messi")
    ronaldo.sayHello(messi)
}