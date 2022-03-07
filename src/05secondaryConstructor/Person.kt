package `05secondaryConstructor`//package `05secondaryConstructor`

//kotlin mendukung pembuatan constructor lebih dari satu (sama seperti java)
class Person(first:String,
             middle:String?,
             last:String?) { //primary constructor
    var firstName = first
    var middleName = middle
    var lastName = last

    //bebas membuat berapapaun dengan syarat harus berbeda parameternya
    constructor(firstParam: String, lastParam: String) //secondary constructor
    //saat membuat secondary constructor, kita wajib memanggil primary constructor (jika ada primary constructor)
            : this(firstParam, null, lastParam) { //memanggil constructor primary
                //Do SOmething Here
            }

    constructor(firstParam: String):this(firstParam,null,null)
}
fun main() {
    val messi = Person("messi")
    val ronaldo = Person("ronaldo","cristiano")
    val yudi = Person("yudi","setiawan","reyhan")

    println("${messi.firstName} ${messi.middleName} ${messi.lastName}")
    println("${ronaldo.firstName} ${ronaldo.middleName} ${ronaldo.lastName}")
    println("${yudi.firstName} ${yudi.middleName} ${yudi.lastName}")
}
