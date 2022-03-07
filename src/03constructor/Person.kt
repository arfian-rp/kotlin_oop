package `03constructor`

    //constructor => mirip seperti function pertama kali dipanggil saat object dibuat
class Person(first:String?=null, last:String?=null){
        var firstName:String? = first
        var lastName:String? = last
}

fun main() {
    val ronaldo = Person(last = "ronaldo", first = "cristiano")
    val messi = Person(last = "messi")
    println("${ronaldo.firstName} ${ronaldo.lastName}")
    println(messi.lastName)
}