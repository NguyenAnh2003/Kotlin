package pratice

fun main() {
    // anonymouse class
    val provider = object : MainProvider {
        override fun getProvider() {
            println("from main provider")
        }
    }

    val provider2 = object : SubProvider {
        override fun getAlmond() {
            println("Receive almond")
        }

        override fun getSubProvider() {
            println("From sub provider")
        }
    }


    provider.getProvider()
    provider2.getAlmond()
    provider2.getSubProvider()
}