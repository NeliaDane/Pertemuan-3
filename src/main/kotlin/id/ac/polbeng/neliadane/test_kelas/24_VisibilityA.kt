package id.ac.polbeng.neliadane.test_kelas

/*Private :Instansiasi kelas dapat dilakukan hanya dari dalam setiap kelas dan objek yang sama.  Visibility  modifier
ini  sangat  berguna  jika  kita  menggunakan  konstruktor tambahan.
 */
private class privateExample {
    private val i = 1
    private fun doSomething() { println("Welcome to Psrivate access!")
        println("Private Access : $i")
    }
    fun calldoSomething(){
        doSomething();
    }
}


//Protected : Pengaturan ini sama dengan visibility modifier private, tetapi instansiasi dapat juga dilakukan dari subclass (konsep inheritance).
open class C() {
    protected val i = 1
}
class D : C() {
    fun getValue() : Int {
        println("Welcome to Protected access!")
        return i
    }
}

/*internal : Instansiasi  dapat  dilakukan  dimanapun  didalam  modul.  Di  Kotlin  module adalah kumpulan file yang dikompilasi
secara bersamaan. Kita dapat menggunakan visibility modifier ini jika kita tidak ingin program lain (dari project lain) mengakses
konstruktor, tapi selain itu kita bisa secara bebas mengakses konstruktor dari kelas dan objek lain didalam program.
 */
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal access!")
        println("Internal Access : $i")
    }
}


/*public : Instansiasi kelas dapat dilakukan dimanapun didalam dan dan luar program. Ini adalah visibility modifier
default ketika konstruktor dibuat tanpa visibility modifier.
 */
class publicExample {
    val i = 1

    fun doSomething() {
        println("Welcome to Public access!")
        println("Public Access : $i")
    }
}


fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected Access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}
