package id.ac.polbeng.neliadane.test_kelas

/*
Blok inisialisasi diawali dengan keyword init. Selama instansiasi sebuah objek, urutan eksekusi
blok inisialisasi sama dengan urutan yang ada pada tubuh kelas, berselangkan inisialisasi
property-nya.
 */
class `5_InitOrder` (name:String) {
    //inisialisasi properti pertama
    val firstProperty = "First property: $name".also(::println)
    init {
        println("Blok penginisialisasi pertama yang mencetak ${name}")
    }

    //inisialisasi properti kedua
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Blok penginisialisasi kedua yang mencetak ${name.length}")
    }
}
fun main(){
    val initOrder = `5_InitOrder`("RPL")
}