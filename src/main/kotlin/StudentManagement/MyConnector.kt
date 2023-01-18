package StudentManagement

import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object MyConnector {
    // help
    private var username: String ? = "sa"
    private var password: String ? = "password"
    private var jdbcURL: String = "jdbc:mysql://localhost:3306/test"
    @JvmStatic fun main(args: Array<String>) {
        getConnection()
    }

    fun getConnection(): Connection? {
        var connection: Connection? = null
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return connection
    }

    fun closeConnection(c: Connection?) {
        try {
            c?.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }
}
