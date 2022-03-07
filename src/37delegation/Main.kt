package `37delegation`

//delegation => meneruskan properties / function ke object yang lain
interface Base{
    fun sayHello(name:String)
}
class MyBase:Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

//delegation manual
//class MyBaseDelegate(val base:Base):Base{
//    override fun sayHello(name: String) {
//        base.sayHello(name)
//    }
//}

//otomatis
class MyBaseDelegate(val base:Base):Base by base

fun main() {
    val base = MyBase()
    base.sayHello("Katty")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Joko")
}