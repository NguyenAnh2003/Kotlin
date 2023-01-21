package pratice

class Provider2: Provider1() {

    override fun shitHead() {
        super.shitHead()
        println("Shit head from 2")
    }
    override fun getProvider() {
        super.getProvider()
        println("From provider 2")
    }

    companion object {
        fun smartHead() {
            println("Not shit head from provider 2")
        }
    }


}