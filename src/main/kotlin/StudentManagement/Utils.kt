package StudentManagement

object Utils {
    fun provideName(text: String?):Student {
        println(text)
        var name = readln()
        return Student(-1, name, -1, "")
    }
}