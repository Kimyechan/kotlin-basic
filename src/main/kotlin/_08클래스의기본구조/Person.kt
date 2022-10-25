package _08클래스의기본구조

fun main() {
    var a = Person("박보영", 1990)
    var b = Person("진정국", 1997)
    var c = Person("장원영", 2004)

    a.introduce()
    b.introduce()
    c.introduce()
}

class Person (var name:String, val birthDay:Int) {

    fun introduce() {
        println("안녕하세요, ${birthDay}년생 ${name}입니다")
    }
}
