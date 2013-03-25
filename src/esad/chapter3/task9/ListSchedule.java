package esad.chapter3.task9;

import java.util.Date;

/**
 * @author grisha_angelov
 */
public class ListSchedule implements Schedule {
    Date dateList[];

    @Override
    public int getDurationInDays() {
        return dateList.length;
    }

    @Override
    public void printSchedule() {

    }
}
