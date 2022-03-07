package `31anonymousClass`

//anonymous class => membuat object dari class yang belum lengkap
interface Action{
    fun action()
}

fun fireAction(action:Action){
    action.action()
}

class sampleAction:Action{
    override fun action() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(sampleAction())

    fireAction(object :Action{//pakai anonymouse class
        override fun action() {
            println("Action One")
        }
    })
    fireAction(object :Action{
        override fun action() {
            println("Action Two")
        }
    })
}