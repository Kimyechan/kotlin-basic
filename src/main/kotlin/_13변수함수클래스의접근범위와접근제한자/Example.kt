package _13변수함수클래스의접근범위와접근제한자

val a = "패키지 스코프"

class B {
    val a = "클래스 스코프"
    fun print() {
        println(a)
    }
}

fun main() {
    val a = "함수 스코프"
    println(a)
    B().print()
}
