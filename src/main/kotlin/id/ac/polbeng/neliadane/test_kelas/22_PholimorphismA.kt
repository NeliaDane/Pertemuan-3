package id.ac.polbeng.neliadane.test_kelas
/*
Polymorphisme adalah salah satu konsep OOP. Static
polymorphism terjadi ketika kita mendefenisikan beberapa
fungsi overloading dengan nama yang sama tetapi berbeda
karakteristik parameter (jenis type dan jumlah parameter).
Ia dipanggil compile-time polymorphisme karena kompiler dapat
menentukan fungsi yang mana dipanggil saat melakukan kompilasi.
 */
fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}

fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}

fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}

fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}

fun main(){
    val a: Number = 99
    val b = 1; val
        c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}