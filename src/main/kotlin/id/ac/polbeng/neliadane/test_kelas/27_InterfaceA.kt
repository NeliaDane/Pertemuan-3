package id.ac.polbeng.neliadane.test_kelas

interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Hello")
    }
}

class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}

fun main() {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}
/*
Sama halnya dengan kelas abstrak, sebuah interface tidak dapat di
instansiasi karena ia tidak memiliki konstruktor.
Pada interfaces kita tidak memerlukan akses modifier final, open atau
abstrak. Anggota interface selalu memiliki akses modifier open, kita
tidak dapat mendeklarasikannya sebagai final. Ia abstrak jika ia tidak
memiliki tubuh, tetapi keyword juga tidak dibutuhkan.
 */