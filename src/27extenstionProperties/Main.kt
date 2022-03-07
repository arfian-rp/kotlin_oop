package `27extenstionProperties`

class Student(val name:String)

val Student.upperName:String
    get() = this.name.uppercase()

fun main() {
    val dwi = Student("dwi")
    println(dwi.upperName)
}