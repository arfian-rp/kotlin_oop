package `29sealedClass`

//sealed class => jenis class yang didesain untuk inheritance
//sealed class tidak bisa diinitialisasi jadi object, dan standart sealed class adalah abstract
//sealed class cocok untuk class parent
//biasanya sealed class digunakan dengan when expression
//dengan sealed class kita hanya membatasi class turunannya yang perlu di check
sealed class Operation(val name:String)
class Plus:Operation("Plus")
class Minus:Operation("Minus")

fun main() {
    fun hitung(a:Int,b:Int,operation:Operation):Int{
        return when(operation){
            is Plus -> a+b
            is Minus -> a-b
        }
    }

    println(
        hitung(12,55,Plus())
    )
    println(
        hitung(12,55,Minus())
    )
}