package `40destructuringDeclaration`

//destructuring decralation => membuat multiple variable dari object
//destructuring tidak bisa dilakukan untuk semua object, hanya object yang memiliki function componentX() yang bisa destrcuturing
class Game1(val name:String, val price:Int){
    operator fun component1():String = name
    operator fun component2():Int = price
}

//saat menggunakan data class secara otomatis akan dibuatkan function componentX() sesuai jumlah parameter
data class Game2(val name:String, val Price:Int)

//Destructuring di function
data class MinMax(val min:Int, val max:Int)
fun minmax(val1:Int, val2:Int):MinMax{
    return when{
        val1>val2 -> MinMax(val2,val1)
        else -> MinMax(val1,val2)
    }
}

//Lamda Function
data class Login(val user:String, val password:String)
typealias LoginCallBack = (Login)->Boolean

fun login(login:Login, callback:LoginCallBack):Boolean{
    return callback(login)
}

fun main() {
    val game1 = Game1("Pubeg",9000)
    val (nama1, harga1) = game1 //destructuring
    println("$nama1 -> $harga1")

    val game2 = Game2("Mobil legends",1000)
    val (nama2, harga2) = game2 //destructuring
    println("$nama2 -> $harga2")

    val (min, max) = minmax(13,66)
    println("MIN: $min, MAX: $max")

    //underscore => tidak dipakai
    val (Min,_) = minmax(133,39)
    println(Min)

    //destructuring lamda parameter
    val request = Login("Yudi","yudi1234")
    val success = login(request, {(user,pass) ->
        user == "Yudi" && pass == "yudi1234"
    })
    println(success)
}