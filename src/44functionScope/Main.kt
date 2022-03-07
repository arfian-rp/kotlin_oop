package `44functionScope`

//scope function => function yg digunakan mengeksekusi obj dgn mudah dgn lamda expression
class Person(val name:String, val age:Int)

fun main() {
    val orang = Person("Pirno",50)
//    orang.let {//Let
//        println(it.name)
//        println(it.age)
//    }

    val result1:String = orang.let{
        "Name: ${it.name}, Age: ${it.age}" //pakai it
    }
    println(result1)

    val result2:String = orang.run{//run
        "Name: ${this.name}, Age: ${this.age}" //pakai this
    }
    println(result2)

    val result3:Person = orang.apply{//run
        "Name: ${this.name}, Age: ${this.age}"
    }
    println(result3) //Person

    val result4:Person = orang.also{//run
        "Name: ${it.name}, Age: ${it.age}"
    }
    println(result4) //Person

    //with
    val result5:String = with(orang) {
        "Name: ${this.name}, Age: ${this.age}"
    }
    println(result5)
}