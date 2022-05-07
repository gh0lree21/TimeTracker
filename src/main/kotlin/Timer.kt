import kotlinx.datetime.*
import kotlin.time.Duration

class Timer {
    // The job of the Timer is to start a time, stop a time
    // calculate the duration of a timer, and to make decisions
    // based upon what is input to the timer menu (from TerminalService).

    // Initialize attributes
    var startingTime: Instant = Clock.System.now()
    var endingTime: Instant = Clock.System.now()
    var the_duration: String = ""

    fun start_timer(project: String) {
        //Creates a new time instant marking the beginning of a period of time
        startingTime = Clock.System.now()
        val start = startingTime.toLocalDateTime(TimeZone.currentSystemDefault()).toString()
        startingTime = start.toInstant()
        println(start)
    }
    fun end_timer(project:String) {
        //Creates a new time instant marking the end of a period of time.
        //Calls calculate_duration() to automatically update the duration
        //attribute
        endingTime = Clock.System.now()
        val end = endingTime.toLocalDateTime(TimeZone.currentSystemDefault()).toString()
        endingTime = end.toInstant()
        calculate_duration()
        print(end)
    }
    private fun calculate_duration() {
        // calculates the different between the current start and end times
        //stored within the class and updates the_duration attribute accordingly
        val duration: Duration = endingTime - startingTime
        val the_duration = duration.toString()
    }
}

//    val currentMoment: Instant = Clock.System.now()
//    val moment = currentMoment.toLocalDateTime(TimeZone.currentSystemDefault()).toString()

// Adding two instants
//    val now = Clock.System.now()
//    val instantInThePast: Instant = Instant.parse("2020-01-01T00:00:00Z")
//    val durationSinceThen: Duration = now - instantInThePast
