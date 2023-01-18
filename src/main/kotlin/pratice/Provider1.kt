package pratice

open class Provider1: MainProvider {

    open fun shitHead() {
        println("Shit head from 1")
    }

    override fun getProvider() {
        println("From Provider 1")
    }
}