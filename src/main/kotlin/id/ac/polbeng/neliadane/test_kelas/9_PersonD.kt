package id.ac.polbeng.neliadane.test_kelas

/*
Konstruktor tambahan (secondary constructor) didefenisikan didalam tubuh kelas. Jika property
kelas tidak diinisialisasi pada saat mendeklarasikannya maka property tersebut harus di
inisialisasi didalam konstruktor tambahan atau blok inisialisasi. Konstruktor tambahan
memerlukan keyword constructor untuk mendefenisikannya. Selain itu konstruktor tambahan
boleh tidak memiliki tubuh kelas dalam pendefenisiannya.
 */

class `8_PersonD` {
    var firstName: String
    var lastName: String
    var age: Int

    //keyword constructor
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }

}
fun main(){
    val nelia = `8_PersonD`("Nelia", "Dane", 21)
    println("Name : ${nelia.firstName} ${nelia.lastName}")
    println("Age : ${nelia.age}")
}