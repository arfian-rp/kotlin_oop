package `28dataClass`

//data class digunakan untuk membuat class yang merepresentasikasn data
//data class => class yang secara otomatis akan membuat function equals, hashcode, toString dan copy dari semua propertiesyang terdapat di primary constructor yang dimiliki data class
data class Product(val name:String,
                   val price:Int,
                   val category:String)

fun main() {
    val product = Product("Indomie",2500,"Food")
    println(product) //Product(name=Indomie, price=2500, category=Food

    //copy data class
    val product2 = product.copy(name = "Supermie")
    println(product2)
}