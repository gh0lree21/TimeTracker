class TerminalService {
    // TerminalService handles the majority of the input and output
    // to the terminal in the program. Ideally it would handle all of
    // it, but this program is incomplete.
    // These return strings. As a result, they will be called
    // from main and the input validation loops will be in main
    // for now.

    fun project_menu(): String {
        //Displays the project menu. Gathers input from user and
        //returns said input.
        println("-----------------")
        println("1. Enter new project")
        println("2. View stored projects")
        println("3. Delete project")
        println("4. Select project")
        println("5. Exit program")
        println("> ")
        var choice = readln()
        return choice
    }
    fun create_project(): String {
        // A selection in the project menu. Gathers input
        // from user and returns the value.
        println("Enter project name: ")
        var name = readln()
        println("Project $name successfully added")
        return name
    }
    fun delete_project(): String {
        // NEEDS WORK. A selection in the project menu. Gathers
        //input from the user and returns the value
        println("Enter project you would like to delete: ")
        var name = readln()
        println("Project $name successfully deleted")
        return name
    }

    fun timer_menu(): String {
        // Displays the timer menu. Gathers input and
        // returns the value.
        println("1. Start new timer")
        println("2. End Timer")
        println("3. Pause Timer")
        println("4. Exit")
        println("> ")
        var choice = readln()
        return choice
    }
    fun display_time(text: String) {
        //Display time. Mostly used in debugging and
        //development. Unlikely that it will stay.
        println("$text")
    }
}