package id.ac.polbeng.neliadane.test_kelas

/*
bentuk kode program yang lebih sederhana atau lebih ringkas lagi dari pada
personA dan personB, yang inisialisasinya dapat di lakukan hanya di dalam
parameter konstruktor utama
 */
class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main(){
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}
