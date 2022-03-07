package `08functionOverLoading`

class Person(var name:String) {
    fun sayHello(name:String){
        println("Hello, $name")
    }
    fun sayHello(firstName:String,lastName:String){
        //function overloading => kemampuan membuat function dengan nama yg sama dalam class
        //wajib menggunakan parameter berbeda (bisa tipe atau jumlah)
        println("Hello $firstName $lastName")
    }
}

fun main() {
    val alex = Person("alex")
    alex.sayHello("heru")
    alex.sayHello("mike","tyson")
}