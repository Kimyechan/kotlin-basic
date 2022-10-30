package _22null값처리하는방법_동일한지확인하는방법

// null-safety
fun main() {
    var a: String? = null

    println(a?.uppercase())

    println(a?:"default".uppercase())

    println(a!!.uppercase())

    var b: String? = "Kotlin Exam"
    b?.run {
        println(uppercase())
        println(lowercase())
    }
}
