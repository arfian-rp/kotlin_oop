package `42nullSafety`

//null safety => agar tidak error NullPointerException
data class Friend(val name:String)

fun main() {
    fun sayHello(friend:Friend?){
//        if(friend!=null){
//            println("Hello ${friend.name}")
//        }
//        println("Hello ${friend?.name}")

        ////Elvis operator
        val name = friend?.name ?: "namaKosong"
        println("Hello $name")

        ////!!Operator => jika null maka error
//        val name = friend!!.name
//        println("Hello $name")


    }
    sayHello(Friend("Yudi"))
    sayHello(null)
}