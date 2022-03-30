package id.ac.polbeng.neliadane.test_kelas

fun main() {
    val boni = Student("Boni", 21)
    val newBoni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    if (boni.equals(newBoni))
        println("boni is equal to newBoni.")
    else
        println("boni is not equal to newBoni.")

    if (boni.equals(meri))
        println("boni is equal to meri.")
    else
        println("boni is not equal to meri.")

    println("Hashcode of boni: ${boni.hashCode()}")
    println("Hashcode of newBoni: ${newBoni.hashCode()}")
    println("Hashcode of meri: ${meri.hashCode()}")
}

/*
Jika dua buah objek memiliki referensi objek yang sama, maka kedua objek tersebut juga
memiliki nilai hashCode yang sama. Kita bisa membandingkan nilai kode hash 2 objek apakah
sama atau tidak dengan menggunakan fungsi hashCode(). Sedangkan untuk membandingkan
nilai pada 2 buah objek dapat dilakukan dengan menggunakan fungsi equals().
 */