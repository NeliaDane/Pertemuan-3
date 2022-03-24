package id.ac.polbeng.neliadane.test_kelas

/*
inisialisasi property konstructor atau (_firstName: String, _lastName: String, _age: Int)
yang di deklarasi dalam tubuh kelas
 */
class `6_PersonA` (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val nelia = `6_PersonA`("Budi", "Gunawan", 21)
    println("Name : ${nelia.firstName} ${nelia.lastName}")
    println("Age : ${nelia.age}")
}