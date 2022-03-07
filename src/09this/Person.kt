package `09this`

class Person(val name:String) {
    fun sayHello(name:String){
        //this=>merepresentasikan object saat ini
        //this hanya bisa digunakan di class itu sendiri
        //biasanya, this digunakan untuk mengakses properti yang tertutup oleh param yang sama
        println("Hello $name, my name is ${this.name}")
    }
}

fun main() {
    val tyson = Person("tyson")
    tyson.sayHello("yudi")
}