package _04조건문과비교연산자

fun main() {

    var a = 7

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작다")
    }
}

fun main2() {
    doWhen(1)
    doWhen("CHAN")
    doWhen(3.14159)
    doWhen("Kotlin")
}

fun doWhen (a: Any) {
    when(a) {
        1 -> println("정수 1입니다")
        "CHAN" -> println("이름")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}

fun doWhen2 (a: Any) {
    var result = when(a) {
        1 -> "정수 1입니다"
        "CHAN" -> "이름"
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }

    println(result)
}
