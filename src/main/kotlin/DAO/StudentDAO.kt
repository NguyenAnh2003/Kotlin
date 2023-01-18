package DAO

import MyConnector
import Student
import java.lang.Exception
import java.sql.SQLException

class StudentDAO: DaoInterface<Student> {
    var c = MyConnector
    // help
    override fun add(s: Student) {
        try {
            var connection = c.getConnection()
            var query = connection?.prepareStatement("insert into student (name, age, gender) values (?,?,?)")
            query?.setString(1, "${s.name}")
            query?.setInt(2, s.age)
            query?.setString(3, "${s.gender}")
            var rs = query?.executeUpdate()
            println("$rs added")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun delete(s: Student) {
        try {
            var connection = c.getConnection()
            var query = connection?.prepareStatement("delete from student where name = ?")
            query?.setString(1, "${s.name}")
            var rs = query?.executeUpdate()
            println("$rs affected")
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    override fun edit(s: Student) {
        try {

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun find(s: Student) {
        try {
            var connection = c?.getConnection()
            var query = connection?.prepareStatement("SELECT * FROM student where name = ?")
            query?.setString(1, "${s.name}")
            var rs = query?.executeQuery()
            if(rs != null) {
                if(rs.next()) {

                }
            }
            connection?.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    override fun list(l: ArrayList<Student>) {
        try {
            var connection = c?.getConnection()
            var query = connection?.prepareStatement("SELECT * FROM student")
            var rs = query?.executeQuery()
            if (rs != null) {
                while(rs.next()) {
                    val id = rs.getInt("id")
                    val name = rs.getString("name")
                    val age = rs.getInt("age")
                    val gender = rs.getString("gender")
                    l.add(Student(id, name, age, gender))
                }
            }
            l.forEach { s -> println(s.toString()) }
            connection?.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}