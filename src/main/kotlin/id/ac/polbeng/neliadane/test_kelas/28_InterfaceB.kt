package id.ac.polbeng.neliadane.test_kelas
/*
Penggunaan Interface Inheritance pada Kotlin.
Antarmuka di Kotlin juga dapat mewarisi antarmuka lain. Ketika
antarmuka memperluas antarmuka lain, ia dapat menambahkan properti dan
metodenya sendiri, dan jenis penerapan harus memberikan definisi untuk
semua properti dan metode di kedua antarmuka. Antarmuka dapat mewarisi
lebih dari satu antarmuka.
 */

interface Named {
    val name: String
}
interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

data class EmployeeB(
// Penerapan "nama" tidak diperlukan
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

fun main(){
    val pegawai = EmployeeB("Ucok", "Baba", "Programmer")
    println(pegawai.name)
}

