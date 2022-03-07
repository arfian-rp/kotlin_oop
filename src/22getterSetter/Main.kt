package `22getterSetter`

class Note(title:String,author:String){
    var title:String = title
        get() = field //GETTER
        //field mengacu ke title
        set(value){ //SETTER
            if(value.isNotBlank()) field=value.uppercase()
        }

    var author:String = author
        get() = field
        set(value){
            if(value.isNotBlank()) field=value.lowercase()
        }
}

fun main() {
    val obj = Note("Hello", "Arfian")
    println(obj.title) //mengakses getter
    obj.title = "My Diary" //mengakses setter
    println(obj.title) //mengakses getter
    println(obj.author) //mengakses getter
    obj.author = "IDA" //mengakses setter
    println(obj.author) //mengakses getter
}