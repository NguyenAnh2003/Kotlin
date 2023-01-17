import java.lang.Exception
import java.sql.DriverManager

object MyConnector {
    // help
    private var username: String ? = "sa"
    private var password: String ? = "password"

    @JvmStatic fun main(args: Array<String>) {
        getConnection()
    }

    fun getConnection() {
        try {
            val connection = DriverManager.getConnection("jdbc:mysql://localhost?serverTimezone=UTC", username, password)
            println("OK")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
