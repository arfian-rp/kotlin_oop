package `45polymorphism`

//polymorphism => banyak bentuk (erat hubungannya dgn inheritance)
open class Employee(val name:String){
    open fun sayHello(name:String) = "Hello $name, my name is ${this.name}"
}

open class Manager(name:String):Employee(name){
    override fun sayHello(name: String) = "Hello $name, my name is Manager ${this.name}"
}

class VicePresident(name:String):Manager(name){
    override fun sayHello(name: String) = "Hello $name, my name is VP ${this.name}"
}

fun main() {
    var person:Employee = Employee("Denny")
    println(person.sayHello("Yanto"))

    person = Manager("Yudi")
    println(person.sayHello("Luna"))

    person = VicePresident("Wahyu")
    println(person.sayHello("Heru"))
}