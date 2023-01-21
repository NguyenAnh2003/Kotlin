package pratice

enum class DAYS {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}


enum class Seasons {
    // summer winter rainy anonymous classes -> Seasons parent class (abstrct fun foo) -> ano classes override from parent

    Summer(){
        // compile time error if not override the function foo()
        override fun foo() {
            println("Hot days of a year")
        }
    },
    Winter(){
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy(){
        override fun foo() {
            println("Rainy days of a year")
        }
    };
    abstract fun foo()
}
fun main()
{
    // inbuilt method properties
    // properties ordinal -> index
    // name -> names of constants defined in enum class

    // method value -> return all values of enum class
    // valueOf returns the enum constant defined in enum

    // A simple demonstration of properties and methods
    println("DAYS")
    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("${DAYS.valueOf("WEDNESDAY")}")
    println("Seasons")
    Seasons.Rainy.foo()
    Seasons.Summer.foo()
    Seasons.Winter.foo()
}


