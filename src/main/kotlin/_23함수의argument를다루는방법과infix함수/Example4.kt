package _23함수의argument를다루는방법과infix함수

fun main() {
    println(6 multiply 4)
    println(6.multiply(4))
}

infix fun Int.multiply(x: Int): Int = this * x
