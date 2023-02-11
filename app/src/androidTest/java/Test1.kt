import android.util.Patterns
import java.lang.Math.sqrt
import java.util.*

class Test1 {
}
fun main() {

    //val text = "user1@gmail.com"
    //text.isValidEmail()

    val array: IntArray = intArrayOf(1,5,0,5,9) //массив для проверки 2е
    println(array.indexOfMax(array)) // 2е
    String.coincidence("Hello world", "HeLLo Hell") // 2f


}
//2b
fun CharSequence?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

//2a
fun sum(vararg num: Double) {
    var x = 0.0
    for (value in num) {
        x = x + value
    }
    println(x)
}

//2e

fun indexOfMax(array: IntArray) : Int? {
    var x = 0
    var count = 0
    if (array.isEmpty()) {
        return null
    } else {
        x = array.max()
        for (i in array) {
            if (x == i)
                count ++
        }
        if (count > 1) return null
     return x
    }
}


//2e
private fun IntArray.indexOfMax(array: IntArray): Int? {
    var x = 0
    var count = 0
    if (array.isEmpty()) {
        return null
    } else {
        x = array.max()
        for (i in array) {
            if (x == i)
                count ++
        }
        if (count > 1) return null
        return x
    }
}

//2f
/*Напишите функцию расширения coincidence для String,
которая проверяет сколько позиций совпало со строкой --- каких позиций? что это за позиции???
переданной в аргументе и возвращает количество совпавших
символов. */
fun String.Companion.coincidence (string: String, ref: String):Int {
    var x = 0
    val chars1 = string.toCharArray()
    val chars2 = ref.toCharArray()
    val intersectedArray = chars1.intersect(chars2.toList()).toCharArray()
    println(Arrays.toString(intersectedArray))
    x = intersectedArray.size
    return x
}


