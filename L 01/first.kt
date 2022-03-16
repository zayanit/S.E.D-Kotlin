/*fun main() {
    //sampleStart
    val a: Int = 1 //immediate assignment
    val b = 2 // 'Int' type is inferred
    val c: Int
    c = 3

    println("a = $a, b = $b, c = $c")

    var x = 5 // 'Int' type is inferred
    x += 1

    println("x = $x")
}*/

val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun main() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}