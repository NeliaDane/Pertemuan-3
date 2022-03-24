package id.ac.polbeng.neliadane.test_kelas

class `7_PersonB` (_firstName: String, _lastName: String, _age: Int) {

    /*
    meringkas program dari kelas personA dengan cara mengaabungkan
    proses deklarasi dan inisial suatu variabel pada blok inisial
    kedalam 1 statement.
     */
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val Nelia = `7_PersonB`("Nelia", "Dane", 21)
    println("Name : ${Nelia.firstName} ${Nelia.lastName}")
    println("Age : ${Nelia.age}")
}