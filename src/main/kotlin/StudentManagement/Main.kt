package StudentManagement

fun main() {
    var menu = Menu()
    menu.printMenu()
    var choice: String;
    var running: Boolean = true;
    do {
        println("Enter your fk choice: ")
        var ans = readln().toInt()
        choice = menu.getSelected(ans)
        when(choice) {
            "exit"->running=false
            else->menu.itemSelected(ans)
        }
    } while (running == true)
}