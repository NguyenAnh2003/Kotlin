import DAO.StudentDAO

class Menu() {
    // help
    var students = ArrayList<Student>() // temp
    var sDAO = StudentDAO()
    var menu = mutableListOf<String>("add student", "delete student", "edit student", "find student", "list of Student", "exit")
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

    fun addProvider(): Student {
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
        return Student(nameStudent = name, ageStudent = age, genderStudent = gender)
    }

    fun deleteProvider(): Student {
        println("Enter name to delete: ")
        var name = readln()
        return Student(name, -1, "")
    }

    fun findProvider(): Student {
        println("Enter name to find: ")
        var name = readln()
        return Student(name, -1, "")
    }

    fun editProvider(): Student {
        println("Enter name to edit: ")
        var name = readln()
        return Student(name, -1, "")
    }

    fun listProvider() {
        students.forEach { i -> println(i) } // static
    }

}