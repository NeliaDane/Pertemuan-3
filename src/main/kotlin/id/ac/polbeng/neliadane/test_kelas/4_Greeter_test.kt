package id.ac.polbeng.neliadane.test_kelas

/*
membuat  file dengan nama 4_Greeter_test yang berfungsi untuk
memanggil class 3_Greeter yang telah di buat sebelumnya
 */
fun main() {
    //memasukkan nama class 3_Greeter pada value untuk menyambungkan file ini ke class yang akan di eksekusi
    val greeter = `3_Greeter`()

    //memanggil greet pertama
    greeter.greet()

    //memanggil greet kedua
    greeter.text = "Hi"
    greeter.greet("Nelia")
    greeter.greet("Dane")

    //memanggil greet ketiga
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Nelia Dane"))
}

