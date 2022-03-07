package `35typeAlias`

//type Alias => biasanya untuk mempersingkat nama tipe data (class)
class Student(val name:String)

typealias Pelajar = Student
typealias Str = String
typealias StringSupplier = (Str)->Str

fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier("Yudi")}")
}

fun main() {
    val murid = Pelajar("Heru")
    println(murid.name)
    val myName:Str = "Arfian"
    println(myName)
    sayHello{value->value.uppercase()}
}

