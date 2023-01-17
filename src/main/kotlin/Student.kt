import java.io.ObjectOutput

class Student(nameStudent:String, ageStudent:Int, genderStudent:String) {
    // help
    constructor() : this("", -1, "") {}

    var id: String = ""
        get() = field
        set(value) {
            field = value
        }
    var name: String = ""
        get() = field
        public set(value) {
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
        id
        name=nameStudent
        age=ageStudent
        gender=genderStudent
    }

    override fun toString(): String {
        return "Student(id='$id', name='$name', age=$age, gender='$gender')"
    }


}