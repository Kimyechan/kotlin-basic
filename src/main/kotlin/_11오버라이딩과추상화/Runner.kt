package _11오버라이딩과추상화

fun main() {
    var d = Dog()

    d.run()
    d.eat()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("응식을 먹습니다")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }

    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}
