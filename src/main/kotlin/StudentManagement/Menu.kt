package StudentManagement

import StudentManagement.DAO.StudentDAO

class Menu() {
    // help
    private var students = ArrayList<Student>() // temp
    private var sDAO = StudentDAO()
    private var menu = mutableListOf<String>("add student", "delete student", "edit student", "find student", "list of StudentManagement.Student", "exit")
    fun printMenu() {
        menu.forEachIndexed { index, i -> println("${index + 1} $i") }
    }

    fun getSelected(index:Int): String {
        return menu.get(index-1)
    }

     fun itemSelected(index:Int) {
        var item = index - 1
        // choice add delete edit find list
        var choice = menu.get(item)
        when(choice) {
            "add student" -> sDAO.add(addProvider())
            "delete student"-> sDAO.delete(deleteProvider())
            "edit student"-> sDAO.edit(deleteProvider())
            "find student"-> sDAO.find(findProvider())
            "list of StudentManagement.Student"-> listProvider()
        }
    }

    private fun addProvider(): Student {
        var name: String = ""
        var age: Int = 0
        var gender:String = ""
        try {
            println("enter fk name: ")
            name = readln()
            println("enter fk age: ")
            age = readln().toInt()
            println("enter gender: ")
            gender = readln()
        } catch (e: Exception) {
            println(e.message)
        }
        return Student(-1, nameStudent = name, ageStudent = age, genderStudent = gender)
    }

    private fun provideNameUtils(text: String?): Student {
        println(text)
        var name = readln()
        return Student(-1, name, -1, "")
    }

    private fun deleteProvider(): Student {
        var s = provideNameUtils("Enter name to delete: ")
        return s
    }

    private fun findProvider(): Student {
        var s = provideNameUtils("Enter name to find: ")
        return s
    }

    private fun editProvider(): Student {
        var s = provideNameUtils("Enter name to edit: ")
        return s
    }

    private fun listProvider() {
        try {
            sDAO.list(students)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}