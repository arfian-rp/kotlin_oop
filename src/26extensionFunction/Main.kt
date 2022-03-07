package `26extensionFunction`

class Student(val name:String){
    fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}

//Extension function => menambah function pada tipe data yang sudah ada
//tidak memodifikasi isi class(tidak bisa mengakses data private & protected)
fun Student?.sayGoodBye(name: String){//?.=> nullable extension
    if(this!=null){
        println("Goodbye $name, my name is ${this.name}")
    }
}

fun main() {
    val hendra = Student("Hendra")
    hendra.sayHello("Atar")
    hendra.sayGoodBye("Galich")

    val heru: Student? = Student("Heru")
    heru?.sayHello("Atar")
    heru.sayGoodBye("Galich")
}