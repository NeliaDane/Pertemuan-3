package id.ac.polbeng.neliadane.test_kelas

class `13_EnkapsulasiB` class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field
    var name: String = _name
        get(){
            return field.toUpperCase()
        }
        set(value) {  //Value adalah nama parameter setter
            field = value
        }
    var age: Int = _age
        get() = field  //Field atau disebut juga backing fields membantu kita untuk merujuk property didalam method getter dan setter.
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}
fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = -1
}

/*
Inisialisasi sintaks getter dan setter di Kotlin bersifat opsional, karena secara sefault Kotlin telah men-generate
method getter dan setter untuk property yang mutable (var) dan hanya getter untuk property yang read-only (val).
Secara default kode yang ter-generate secara otomatis.

 Field sangat dibutuhkan, jika kita menggunakan property secara langsung didalam method getter dan setter maka kita akan
 memanggil program secara rekursif dan menyebabkan error StackOverflowError. Kita juga dapan merubah method setter dan
 getter default, sesuai dengan keinginan kita.
 */