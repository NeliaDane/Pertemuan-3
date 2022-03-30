package id.ac.polbeng.neliadane.test_kelas
/*
Untuk sebuah data kelas, kita dapat membuat sebuah objek salinan(copy)
dengan beberapa property yang berbeda menggunakan fungsi copy()
 */
fun main(){
    val meri = Student("Meri", 20)
    val badu = meri.copy("Badu")
    if(meri.equals(badu))
        println("meri is equal to badu.")
    else
        println("meri is not equal to badu.")
        println("Hashcode of meri: ${meri.hashCode()}")
        println("Hashcode of badu: ${badu.hashCode()}")
}

