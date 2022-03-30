package id.ac.polbeng.neliadane.test_kelas
/*
Kotlin juga mendukung destruksi data kelas sebuah objek kedalam
sejumlah variabel menggunakan fungsi componentN(). Fungsi component1()
mengembalikan nilai property pertama pada sebuah objek, fungsi
component2() mengembalikan nilai property kedua pada sebuah objek,
begitu selanjutnya hingga N property pada sebuah kelas.
 */

fun main() {
    val meri = Student("Meri", 20)
// Destructuring Declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}
