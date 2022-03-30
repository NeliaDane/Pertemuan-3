package id.ac.polbeng.neliadane.test_kelas

/*
Kotlin membutuhkan eksplisit akses modifier untuk meng-override fungsi
pada kelas induk yaitu akses modifier open.
 */
open class Teacher {
    /*
     harus menggunakan "open" untuk membuka akses modifier kelas anak agar bisa
     meng-override fungsi pada kelas induk

     */
    open fun teach() {
        println("Teaching...")
    }
    fun info(){
        println("I'am a Teacher.")
    }
}
class MathsTeacher : Teacher() {
    // harus menggunakan override modifier fungsi kelas dasar.
    override fun teach() {
        println("Teaching Maths...")
    }
}
fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}