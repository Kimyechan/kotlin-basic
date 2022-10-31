package _23함수의argument를다루는방법과infix함수

fun main() {
    sum(1, 2, 3, 4)
}

fun sum(vararg numbers: Int) {
    var sum = 0

    for (n in numbers) {
        sum += n
    }

    println(sum)
}
