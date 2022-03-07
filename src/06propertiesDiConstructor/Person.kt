package `06propertiesDiConstructor`

class Person(var firstName:String,
             var lastName:String) { //deklarasi properties langsung di primary constructor
}

fun main() {
    val tyson = Person("mike","tyson")
    println("${tyson.firstName} ${tyson.lastName}")
}