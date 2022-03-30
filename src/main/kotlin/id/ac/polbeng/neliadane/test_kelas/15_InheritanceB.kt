package id.ac.polbeng.neliadane.test_kelas

// kelas anak (inisialisasi dari kelas induk)
class LaptopB : Computer{
    val batteryLife: Double
    // pemanggilan key super() untuk inisialisasi kelas induk
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }
    // pemanggilan kelas yang tidak memiliki primary constructor (pemanggilan keywoard super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}

/*
Jika di kelas anak tidak memiliki primary constructor, maka semua secondary constructor yang di inisialisasi kelas induk
dipanggil dengan keyword super secara langsung atau mendelegasikan ke konstruktor yang lain.
 */