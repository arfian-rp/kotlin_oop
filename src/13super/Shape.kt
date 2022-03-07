package `13super`

open class Shape {
    open val corner:Int=-1

    open fun getName() = println("ini Shape")
}

class Rectangle:Shape(){
    override val corner:Int=4
    val parentCorner:Int= super.corner //mengakses properties milik parent

    override fun getName() {
        println("ini Rectangle")
        super.getName()
    }
}

fun main() {
    val obj = Rectangle()
    println(obj.corner)
    println(obj.parentCorner)
    obj.getName()
}