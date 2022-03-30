package id.ac.polbeng.neliadane.test_kelas

//cara mengakses anggota kelas dari nested class
class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(Outer.Nested().b)

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}
/*
Ketika sebuah kelas dideklarasikan didalam kelas lain, maka ia disebut
dengan nested class. Nested class di Kotlin sama dengan static nested
class di Java. Hal yang perlu diperhatikan dalam nested class :
1. Sebuah nested class tidak dapat mengakses anggota dari kelas luarnya.
2. Untuk mengakses anggota dari nested class, kita gunakan („.‟)
operator dengan outer kelasnya.
 */