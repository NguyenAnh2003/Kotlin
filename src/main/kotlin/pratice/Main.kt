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

    // testing 1
    println("Test 1")
    provider.getProvider()
    provider2.getAlmond()
    provider2.getSubProvider()
    // testing 2
    println("Test 2")
    var p2 = Provider2.smartHead()
    var shithead = NoPurpose.leave()
}