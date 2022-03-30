package id.ac.polbeng.neliadane.test_kelas

data class Student(val name: String, val age: Int)

fun main() {
    val nelia = Student("Nelia", 21)
    val nurul = Student("Nurul", 20)
    println("Student Name is: ${nelia.name}")
    println("Student Age is:  ${nelia.age}")
    println("Student Name is: ${nurul.name}")
    println("Student Age is:  ${nurul.age}")
}

/*
Sebuah data kelas sama seperti kelas biasa tapi memiliki tambahan
funsionalitas. Di Kotlin kita tidak perlu menulis atau men-generate
semua data kelas seperti method Getter dan Setter di Java, Kotlin telah
men-generate secara otomatis fungsi Getter dan Setter pada setiap
anggota kelas. ia juga menurunkan implementasi fungsi standar seperti equals(),
hashCode() dan toString() dari property yang dideklarasikan didalam
data kelas kontruktor utama
 */
