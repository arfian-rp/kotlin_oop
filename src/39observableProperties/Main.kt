package `39observableProperties`

import kotlin.properties.Delegates

//observable properties => kita bisa tahu properties, value sebelum dan value setelah ketika diubah
class ObservableProperties(name:String){
    var name:String by Delegates.observable(name){
        property, oldValue, newValue ->
        println("$property changed from $oldValue to $newValue")
    }
}

fun main() {
    val obj = ObservableProperties("Judika")
    obj.name = "Yudika"
}