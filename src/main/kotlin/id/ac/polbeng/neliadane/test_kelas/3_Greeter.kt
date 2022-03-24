package id.ac.polbeng.neliadane.test_kelas

class `3_Greeter` {
    //membuat atribut variabel dengan tipe string
    var text: String = ""

    //fungsi greet yang akan di panggil pertama
    fun greet() {
        println("Hello object world!")
    }

    //fungsi greet kedua yang akan dipanggil dengan text dan name
    fun greet(name: String) {
        println("$text $name")
    }

    //fungsi with_ret_val yang memiliki satu parameter bertipe String dengan nilai kembali String.
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}

