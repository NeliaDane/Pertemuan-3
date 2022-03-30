package id.ac.polbeng.neliadane.test_kelas

/*
Aturan Overriding : Di Kotlin, implementasi inheritance diatur dengan aturan (rule) : jika sebuah kelas mewarisi
implementasi method yang sama atau ganda dari kelas induk perantara, maka ia mesti di override dan menyediakan
implementasinya. Untuk menunjukan supertype dari kelas yang diwarisi oleh anggota dapat dilakukan dengan menggunakan
keyword super<Base>.

 */
open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}


interface Polygon {
    fun draw() { // interface members are 'open' by default println("From interface Polygon")
    }
}


class Square() : Rectangle(), Polygon {
// The compiler requires draw() to be overridden:
override fun draw() {
    super<Rectangle>.draw() // pemanggilan untuk Rectangle.draw()
    super<Polygon>.draw() // pemanggilan untuk Polygon.draw()
}
}


fun main() {
    val square = Square()
    square.draw()
}
