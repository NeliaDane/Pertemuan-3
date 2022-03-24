package id.ac.polbeng.neliadane.test_kelas

class `11_PersonF` (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val anton = `11_PersonF`("Anton", "Sejati")
    val budi = `11_PersonF`("Budi", "Gunawan", 21)
    val caca = `11_PersonF`("Caca", "Andika", "Indonesia")
    val dono = `11_PersonF`("Dono", "Putri", 25, "Indonesia")
}

/*
di dalam 3 buah keyword constructor ada 1 keyword constructor utama
keyword constructor tambahan yang pertama dan kedua mendelegasi keyword
constructor utama. keyword constructor tambahan ketiga mendelegasi keyword
constructor pertama.
 */