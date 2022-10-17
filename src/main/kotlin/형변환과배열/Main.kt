package 형변환과배열

fun main() {
    // 코틀린은 명시적 형변환만 제공
    /**
     * toByte()
     * toShort()
     * toInt()
     * toLong()
     * toFloat()
     * toDouble()
     * toChar()
     */

    var a: Int = 54321
    var b: Long = a.toLong()
}

fun main2() {

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] =  8
    println(intArr[2])
}
