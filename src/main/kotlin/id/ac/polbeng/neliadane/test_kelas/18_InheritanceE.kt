package id.ac.polbeng.neliadane.test_kelas

/*
Overriding Property’s Getter/Setter method : Kita dapat meng-override property kelas
menggunakan inisialisasi atau menggunakan custom setter dan getter function.

 */
open class NewPerson {
    open var age: Int = 1
}

class CheckedPerson: NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("umur tidak bisa negatif")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 // Works


    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5  // Throws IllegalArgumentException : Umur tidak boleh negatif
}

