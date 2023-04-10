package `in`.iot.lab.teacherreview.feature_teacherlist.presentation.stateholder

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AddReviewViewModel : ViewModel() {

    var userInputOverallRating: Double by mutableStateOf(0.0)
        private set

    var userInputMarkingRating: Double by mutableStateOf(0.0)
        private set

    var userInputAttendanceRating: Double by mutableStateOf(0.0)
        private set

    var userInputTeachingRating: Double by mutableStateOf(0.0)
        private set

    /**
     * This function updates the user Input Overall Rating variable
     *
     * @param flag
     * If the flag is 1 then it increases otherwise it decreases the variable
     */
    fun updateUserInputOverallRating(flag: Int) {
        if (flag == 1 && userInputOverallRating < 5)
            userInputOverallRating++
        if (flag == 0 && userInputOverallRating > 0)
            userInputOverallRating--
    }

    /**
     * This function updates the user Input Marking Rating variable
     *
     * @param flag
     * If the flag is 1 then it increases otherwise it decreases the variable
     */
    fun updateUserInputMarkingRating(flag: Int) {
        if (flag == 1 && userInputMarkingRating < 5)
            userInputMarkingRating++
        if (flag == 0 && userInputMarkingRating > 0)
            userInputMarkingRating--
    }

    /**
     * This function updates the user Input Attendance Rating variable
     *
     * @param flag
     * If the flag is 1 then it increases otherwise it decreases the variable
     */
    fun updateUserInputAttendanceRating(flag: Int) {
        if (flag == 1 && userInputAttendanceRating < 5)
            userInputAttendanceRating++
        if (flag == 0 && userInputAttendanceRating > 0)
            userInputAttendanceRating--
    }

    /**
     * This function updates the user Input Teaching Rating variable
     *
     * @param flag
     * If the flag is 1 then it increases otherwise it decreases the variable
     */
    fun updateUserInputTeachingRating(flag: Int) {
        if (flag == 1 && userInputTeachingRating < 5)
            userInputTeachingRating++
        if (flag == 0 && userInputTeachingRating > 0)
            userInputTeachingRating--
    }

}