// A function with two Int parameters and Int return type
//fun sum(a : Int, b : Int) : Int {
    /*val x = a + b
    return x*/

    //return a + b
//}

// A function body can be an expression. Its return type is inferred
fun sum(a : Int, b : Int) = a + b

// A function that returns no meaningful value
fun printSum(a : Int, b : Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted
fun printSum2(a : Int, b : Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun main() {
    print("Sum of 3 and 5 is ")
    println(sum(3, 5))
    printSum(-1, 8)

    repeat(3) {
        println("Hello")
    }

    repeat(3) { index->
        println("Hello with index $index")
    }

    repeat(0) {
        error("We should not get here!")
    }
}