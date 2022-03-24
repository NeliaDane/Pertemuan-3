package id.ac.polbeng.neliadane.test_kelas

class `9_PersonE` {
    var firstName: String
    var lastName: String
    var age: Int = 25

    //keyword constructor pertama
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }

    //keyword construktor kedua
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }

    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val nelia = `9_PersonE`("Nelia", "Dane")
    nelia.cetakInfo()
    println()
    val dane = `9_PersonE`("Nelia", "Dane", 21)
    dane.cetakInfo()
}

/*
Keyword this merujuk pada keyword konstruktor kedua. Pada contoh
diatas this(_firstName, _lastName) merujuk pada konstruktor yang pertama
dan akan memanggilnya terlebih dahulu sebelum kode didalam konstruktor
yang kedua dieksekusi.
 */