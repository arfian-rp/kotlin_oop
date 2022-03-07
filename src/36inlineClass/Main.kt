package `36inlineClass`

//membuat class yg banyak dapat memkan memori
//inline class digunakan biasanya pada class yg memili 1 properties
//syarat properties cuma 1

inline class Token(val value:String){
    fun toUpper():String = value.uppercase()
}

fun main() {
    val login = Token("rahasiaaaa")
    println(
        login.toUpper()
    )
}