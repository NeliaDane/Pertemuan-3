package id.ac.polbeng.neliadane.test_kelas
/*
Dynamic Polymorphism (Overriding Function).Dynamic polymorphism terjadi ketika mendefenisikan beberapa fungsi yang di
override. Dalam kasus ini fungsi yang dipanggil ditentukan pada saat runtime.
 */

open class MyBase {
    // Harus menggunakan pengubah "open" untuk mengizinkan kelas anak menimpanya
    open fun think () {
        println("Hey!! i am thinking ")
    }
}


class MyDerived: MyBase() { // pewarisan terjadi menggunakan konstruktor default
    // Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun think() {
        println("I Am from Child")
    }
}
fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}
