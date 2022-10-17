/**
 * var : 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능함
 * val : 선언시에만 초기화 가능, 중간에 값을 변경할 수 없음
 *
 * 클래스에 선언된 변수 : Property (속성)
 * 이 외의 Scope내에 선언된 변수 : Local Variable (로컬변수)
 *
 */
fun main() {

    var a: Int = 123
    println(a)
}

fun main2() {

    var a: Int? = null
    println(a)
}

fun main3() {

    var intValue:Int = 1234
    var longValue:Long = 1234L
    var intValueByHex:Int = 0x1af
    var intValueByBin:Int = 0b10110110

    // 8진수는 제공하지 않는다
}

fun main4() {

    var doubleValue:Double = 123.5
    var doubleValueWithExp:Double = 123.5e10
    var floatValue:Float = 123.5f
}

fun main5() {
    // 모든 문자 하나당 2bytes
    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'
}

fun main6() {

    var booleanValue:Boolean = true
}

fun main7() {

    val stringValue = "one line string test"
    val multiLineStringValue = """multiline
    string
    test"""
}
