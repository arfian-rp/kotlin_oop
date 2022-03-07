package `30innerClass`

//class di dalam class (inner)
//kelas diluar (outer)
//class inner tidak bisa mengakses data outer begitupun sebaliknya
//agar bisa, gunakan kata kunci inner
class Boss(val bossName:String){

    class Employee(val employeeName:String){
        fun hi(){
            println("Hi, my name i $employeeName")
        }
    }

    inner class EmployeeInner(val employeeName: String){
        fun hi(){
            println("Hi, my name is $employeeName, and my boss is ${this@Boss.bossName}")
        }
    }

}

fun main() {
    val employee1 = Boss.Employee("Adi")//cara mengakses Employee
    employee1.hi()

    val boss = Boss("Arfian")
    val employee2 = boss.EmployeeInner("Yudi")
    employee2.hi()
}