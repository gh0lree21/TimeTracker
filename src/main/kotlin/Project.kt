class Project(var name: String){
    //The responsibility of the Project class is to keep track of
    //its own details.
    private var projectName: String = name
    private val timer = Timer()
    private var projectTime = timer.the_duration

    fun get_name(): String {
        // Returns the project name
        return projectName
    }

    fun get_time(): String {
        //Returns the time spent on this project
        return projectTime
    }
}