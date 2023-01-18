import DAO.StudentDAO

class Menu() {
    // help
    private var students = ArrayList<Student>() // temp
    private var sDAO = StudentDAO()
    private var menu = mutableListOf<String>("add student", "delete student", "edit student", "find student", "list of Student", "exit")
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
            "add student" -> {
                var s: Student = addProvider()
                sDAO.add(s)
            }
            "delete student"-> {
                var s: Student = deleteProvider()
                sDAO.delete(s)
            }
            "edit student"-> {
                var s: Student = editProvider()
                sDAO.edit(s)
            }
            "find student"-> {
                var s: Student = findProvider()
                sDAO.find(s)
            }
            "list of Student"-> listProvider()
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

    private fun deleteProvider(): Student {
        println("Enter name to delete: ")
        var name = readln()
        return Student(-1, name, -1, "")
    }

    private fun findProvider(): Student {
        println("Enter name to find: ")
        var name = readln()
        return Student(-1, name, -1, "")
    }

    private fun editProvider(): Student {
        println("Enter name to edit: ")
        var name = readln()
        return Student(-1, name, -1, "")
    }

    private fun listProvider() {
        try {
            sDAO.list(students)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}