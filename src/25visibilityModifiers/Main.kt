package `25visibilityModifiers`

/*
* visibility modifiers => public, private, protected, internal
* standart nya public
*
* public => bisa diakses dari manapun (default)
* private => hanya bisa diakses di tempat deklarasi
* protected => hanya bisa diakses di tempat deklarasi dan turunannya
* internal => hanya bisa diakses di module/project yang sama
* */

open class Teacher{
    private fun teach(){
        println("Teach")
    }
    fun teachPublic(){
        this.teach()
    }
    fun teachProtected(){
        println("Teach")
    }
}

class SuperTeach:Teacher(){
    fun test() = super.teachProtected() //bisa diaklses di kelas turunan
}

fun main() {
    val teacher = Teacher()
    //teacher.teach()//ERROR
    teacher.teachPublic()
}