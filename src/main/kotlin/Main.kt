import javax.management.ObjectInstance
import javax.management.ObjectName

fun main() {
    //Set up objects, lists, and variables.
    val terminalService = TerminalService()
    var isUsing: Boolean = true
    // Created aProject so that I would have something to put in
    //my collection projects. It is overwritten on line 17
    val aProject = Project("Something")
    var projects =  mutableListOf(aProject, )

    //Begin program loop.
    while (isUsing == true) {
        var menu_selection = terminalService.project_menu()
        //Add Project Menu Item
        if (menu_selection == "1" && projects[0] == aProject) {
            var name = terminalService.create_project()
            var newProject = Project(name)
            projects[0] = newProject
        }
        //Add project (after first project) Menu Item
        else if (menu_selection == "1") {
            var name = terminalService.create_project()
            var newProject = Project(name)
            projects.add(newProject)
        }
        //View Projects TODO:(Add selection feature?)
        else if (menu_selection == "2") {
            for (project in projects) {
                println(project.get_name())
            }

        }
        // Delete TODO:(Does Not Work)
        else if (menu_selection == "3") {
            var name = terminalService.delete_project()
            for (project in projects) {
                var projectName = project.get_name()
                if (projectName == name) {
                    projects.remove(project)
                }
            }
        }
        //Select Program TODO(Not complete)
        else if (menu_selection == "4") {
            println("Which program would you like to select? ")
            val program = readln()
            for (project in projects) {
                var projectName = project.get_name()
                if (projectName == program) {
                    var choice = terminalService.timer_menu()
                } else {
                    // TODO(Input Validation)
                }
            }
        }
        // Exit program Menu Item.
        else if (menu_selection == "5") {
            isUsing = false
        //Input validation
        } else {
            println("Please enter a valid menu item number!")
        }
    }//End of main while loop.

} // End of Main function.