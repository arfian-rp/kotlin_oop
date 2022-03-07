package `41operatorOverloading`

//operator overloading => membuat functiojn dari operator seperti opertor matematika
class Fruit(val price:Int){
    operator fun plus(fruit: Fruit):Fruit{
        return Fruit(fruit.price+ this.price)
    }

    override fun toString(): String = "Harga buah => ${this.price}"
}

fun main() {
    val fruit = Fruit(25_000)+Fruit(25_000) //menjalankan function plus
    println(fruit)
}

/*
* expression
* +a    a.unaryPlus()
* -a    a.unaryMinus()
* a!    a.not()
*
* a++   a.inc() + see below
* a--   a.dec() + see below
*
* a+b   a.plus(b)
* a-b   a.minus(b)
* a*b   a.times(b)
* a/b   a.div(b)
* a%b   a.rem(b)
* a..b  a.rangeTo(b)
*
* a in b    b.contains(a)
* a !in b   !b.contains(a)
*
* a[i]              a.get(i)
* a[i,...,j]        a.get(i,...,j)
* a[i]=b            a.set(i, b)
* a[i,...,j]=b      a.set(i,...,j,b)
*
* a()   a.invoke()
* a(i)  a.invoke(i)
* a(i,...,j)  a.invoke(i,...,j)
*
* a+=b  a.plusAssign(b)
* a-=b  a.minusAssign(b)
* a*=b  a.timesAssign(b)
* a/=b  a.divAssign(b)
* a%=b  a.remAssign(b)
* */