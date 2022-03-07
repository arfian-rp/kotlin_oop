package `20abstractClass`

//Abstract class => tidak bisa dibuat sebagai object(hanya bisa diturunkan)
abstract class Location(val name:String) //abstract otomatis open

class City(name:String): Location(name)

fun main() {
    //val location = Location("Yudi") //ERROR
    val city = City("Jember")
}