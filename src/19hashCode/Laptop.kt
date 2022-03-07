package `19hashCode`

class Laptop(val merk:String)

class Hp(val merk:String){
    //hashCode => function yg digunakan sebagai representasi angka unit untuk object yang dibuat
    //fungsi hasCode saat kita ingin mengkonversi object jadi angka
    //salah satu penggunaan hashCode adalah di structur data (memastikan tidak ada data yg duplikat)
    override fun hashCode(): Int {//MEMODIFIKASI hashCode()
        return this.merk.hashCode()
    }
}

fun main() {
    val laptop1 = Laptop("MSI")
    val laptop2 = Laptop("MSI")
    println(laptop1.hashCode()==laptop2.hashCode())

    val hp1 = Hp("Iphone")
    val hp2 = Hp("Iphone")
    println(hp1.hashCode())
    println(hp2.hashCode())
    println(hp1.hashCode()==hp2.hashCode())
}