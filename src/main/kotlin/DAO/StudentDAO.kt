package DAO

import Student
import java.lang.Exception

class StudentDAO: DaoInterface<Student> {
    // help
    override fun add(s: Student) {
        try {
            println(s.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun delete(s: Student) {
        try {
            println("Delete name ${s.name}")

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun edit(s: Student) {
        try {
            println("Edit name ${s.name}")
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun find(s: Student) {
        try {
            println("Find name ${s.name}")
        } catch (e: Exception) {

        }
    }

    override fun list(l: ArrayList<Student>) {
        try {
            println("SHIT LIST")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}