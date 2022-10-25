package _09클래스의생성자

import _08클래스의기본구조.Person

fun main() {
    var a = Person("박보영", 1990)
    var b = Person("진정국", 1997)
    var c = Person("장원영", 2004)

    var d = Person("이루다")
    var e = Person("차은우")
    var f = Person("류수정")
}

class Person(var name:String, val birthYear:Int) {
    init {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다")
    }

    constructor(name:String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}
