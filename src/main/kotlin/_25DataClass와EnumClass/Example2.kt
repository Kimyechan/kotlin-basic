package _25DataClass와EnumClass

fun main() {

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleepIng())

    state = State.EAT
    println(state.message)
}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleepIng() = this === SLEEP
}
