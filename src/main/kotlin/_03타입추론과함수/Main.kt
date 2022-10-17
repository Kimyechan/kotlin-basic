package _03타입추론과함수

fun main() {
    var a = 1234
    var b = 1234L

    var c = 12.45
    var d = 12.45f

    var e = 0xABCD
    var f = 0b01010101

    var g = true
    var h = 'c'
}

fun main2() {

    println(add(5, 6, 7))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun add2(a: Int, b: Int, c: Int) = a + b + c
