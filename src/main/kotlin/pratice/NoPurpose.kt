package pratice

// object delaration
object NoPurpose {
    fun leave() {
        println("LEAVE")
    }
}

//open class Person() {
//    fun eat() = println("Eating food.")
//
//    fun talk() = println("Talking with people.")
//
//    open fun pray() = println("Praying god.")
//}
//
//fun main(args: Array<String>) {
//    val atheist = object : Person() {
//        override fun pray() = println("I don't pray. I am an atheist.")
//    }
//
//    atheist.talk()
//    atheist.pray()
//}

class ToBeCalled {
    companion object{
        fun callMe() = println("You are calling me :)")
    }
}
fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3)
    println(list)
    list.swap(0, 1)
    println(list)
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

sealed interface Menu {
    data class PIZZA(val name: String, val size: String, val quantity: Int): Menu
    data class BURGER(val quantity: Int, val size: String): Menu
    data class CHICKEN(val quantity: Int, val pieces: String): Menu
}


fun checkTemperature(temperature: Int): Boolean {
    if (temperature != null) {
        if(temperature > 40) return true
    }
    return false
}