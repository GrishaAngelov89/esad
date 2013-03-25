package esad.chapter3.task9;

/**
 * @author grisha_angelov
 */
public class Course {
    private String courseTitle;
    private Schedule schedule;

    int getDurationInDays() {
        return schedule.getDurationInDays();
    }

    void printSchedule() {
        schedule.printSchedule();
    }
}
