package StudentManagement

import java.io.ObjectOutput

class Student(idStudent: Int, nameStudent:String, ageStudent:Int, genderStudent:String) {
    // help
    constructor() : this(-1, "", -1, "") {}

    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
    var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var gender: String = ""
        get() = field
        set(value) {
            field = value
        }
    init {
        id=idStudent
        name=nameStudent
        age=ageStudent
        gender=genderStudent
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, gender='$gender')"
    }


}