package id.ac.polbeng.neliadane.test_kelas

/*
Inheritance adalah salah satu konsep OOP. Inheritance mengizinkan sebuah kelas
untuk mewariskan fitur kelas (property dan method) ke kelas lainnya. Kelas yang
mewarisi fitur kelas lainnya dipanggil child class atau derived class atau subclass
dan kelas yang fiturnya diwariskan dipanggil parent class atau base class atau super
class. Semua kelas di Kotlin memiliki base class yang dipanggil Any. Ia berkorespodensi
dengan kelas Object di Java. Setiap kelas yang dibuat di Kotlin secara implisit pewarisan
dari kelas Any. Kelas Any berisi tiga method yaitu equals() , hashCode() dan toString(). Semua kelas di Kotlin mewarisi
ketiga method dari kelas Any dan dapat di override.
 */

// kelas induk : kelas induk harus memiliki akses modifier open agar dapat diwariskan ke kelas anak.
open class Computer(val name: String,
                    val brand: String) {
}

/*
kelas anak (inisialisasi dari kelas induk) : kelas anak memiliki tanggung jawab untuk menginisialisasi kelas induknya.
anak memiliki sebuah primary constructor, maka ia harus menginisialisasi kelas induknya di bagian kanan kelas header
dengan melewatkan parameter ke primary constructor nya.
 */
class Laptop(name: String,
             brand: String,
             val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}