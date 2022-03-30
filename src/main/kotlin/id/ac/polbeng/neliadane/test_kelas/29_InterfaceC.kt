package id.ac.polbeng.neliadane.test_kelas

/*
di Kotlin, kelas dapat menerapkan beberapa antarmuka. Ini adalah
pengetahuan umum. Sebuah kelas juga dapat menggunakan delegasi untuk
mengimplementasikan berbagai antarmuka di mana implementasi berasal
dari setiap objek yang didelegasikan yang diteruskan ke konstruktor.
 */
interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y  {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

// This class implements X and Y interfaces
class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }
}

fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}