package `43exception`

//exception => merepresentasikan error
//semua tipe data error turunan dari Throwable

class  ValidationError(msg:String):Throwable(msg)

fun main() {
    fun sayHello(name:String){
        if(name.isBlank()){
            throw ValidationError("Name is blank")
        }
        println("Hello $name")
    }

    sayHello("Yudi")
//    sayHello("")

    //cara mengatasi exception
    try {
        sayHello("")
    }catch (e:ValidationError){
        println("Error ValidationError") //dijalankan apabila error Validation
    }

//    catch (e:Throwable) {
//        println("Error Umum") //dijalankan apabila error Throwable(umum)
//    }

    finally {
        println("Selesai") //pasti dijalankan diakhir (error maupun tidak)
    }
}