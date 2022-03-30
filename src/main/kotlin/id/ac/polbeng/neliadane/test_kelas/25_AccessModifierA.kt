package id.ac.polbeng.neliadane.test_kelas
/*
Akses modifier di Kotlin terdiri dari final, open, abstract, dan override. Akses modifier di Kotlin berpengaruh terhadap
perwarisan (inheritance). Secara default seluruh fungsi dan kelas di Kotlin apabila tidak terdapat akses modifier-nya maka
secara implisit akses modifier-nya adalah final. Sehingga apapun kelas dan method di Kotlin harus memiliki akses modifier
open untuk menurunkan maupun meng-override methodnya. Apapun kelas dapat diturunkan dan methodnya dapat di override (ditulis
kembali) secara default-nya.
 */
open class Mahasiswa(var nama: String, var nrp: Int) {
    open fun info() {
        println(nama + '\n' + nrp);
    }

    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {


    @Override
    override fun info() {
        println(nama + '\n' + nrp + '\n' + jurusan);
    }
}

fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")
    println(anton.toString());
    println()
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)


    println()
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)
    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)
}