package `02properties`

class Person {
    var firstName:String = "" //kalau val jadi immutable
    var lastName:String = ""
}

fun main() {
    val ronaldo = Person()
    ronaldo.firstName = "cristiano" //memanipulasi properties
    ronaldo.lastName = "ronaldo"

    println("${ronaldo.firstName} ${ronaldo.lastName}")
}