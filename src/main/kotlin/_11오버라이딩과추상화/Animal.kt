package _11오버라이딩과추상화

fun main() {
    val r = Tiger()

    r.eat()
}

open class Animal {
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}
