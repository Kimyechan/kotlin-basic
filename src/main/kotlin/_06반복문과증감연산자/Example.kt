package _06반복문과증감연산자

fun example() {
    for (i in 0..9) {
        print(i)
    }

    for (i in 0..9 step 3) {
        print(i)
    }

    for (i in 9 downTo 0) {
        print(i)
    }

    for (i in 'a'..'e') {
        print(i)
    }
}
