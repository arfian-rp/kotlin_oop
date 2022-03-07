package `32enumClass`

//enum class => representasi dari class yang sudah tetap nilainya
//biasanya digunakan untuk jenis data yang udah baku, seperti: jenis kelamin, arah mata angin, dsj
enum class Gender(val description:String){
    MALE("cowok"),
    FEMALE("cewek"); //harus tambahkan ;

    fun showDesc(){
        println(this.description)
    }
}

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all:Array<Gender> = Gender.values()

    //conversi String ke object enum
    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(all.toList())

    manFromString.showDesc()
    womanFromString.showDesc()
}