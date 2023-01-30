package pratice

import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormat() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormat()
            EntityType.HARD -> type.name
            EntityType.HELP -> type.getFormat()
        }
        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}


sealed class Entity() {
    object Help: Entity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()

}


val ent = Entity.Easy("id", "name")
val ent2 = Entity.Easy("id", "name")
//    val msg = when(ent) {
//        Entity.Help -> "help"
//        is Entity.Easy -> "easy"
//        is Entity.Hard -> "hard"
//        is Entity.Medium -> "medium"
//    }
//println(ent.equals(ent2))

fun main() {
    val book2 = Book("Kotlin", "Tutorials Point", 10)
    val book = Book("Kotlin", "Tutorials Point", 10)
    println(book.name)
    println(book.publisher)
    println(book.reviewScore)
    println(book.toString())
    println(book.equals(book2))
}

data class Book(val name: String, val publisher: String, var reviewScore: Int)