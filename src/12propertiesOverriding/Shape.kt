package `12propertiesOverriding`

//secara standart, properties di class bersifat final
//agar dapat di override gunakan open
open class Shape {
    open val corner:Int=-1
}

class Rectangle:Shape(){
    override val corner:Int=4
}

class Triangle:Shape(){
    override val corner:Int=3
}

fun main() {
    val objek1 = Rectangle()
    println(objek1.corner)
    val objek2 = Triangle()
    println(objek2.corner)
}