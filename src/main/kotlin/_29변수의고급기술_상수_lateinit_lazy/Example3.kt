package _29변수의고급기술_상수_lateinit_lazy

fun main() {
    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
}

