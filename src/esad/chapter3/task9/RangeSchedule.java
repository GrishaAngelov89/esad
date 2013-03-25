package esad.chapter3.task9;

import java.util.Date;

/**
 * @author grisha_angelov
 */
public class RangeSchedule implements Schedule {
    private Date fromDate;
    private Date toDate;
    private final int msInOneDay = 24 * 60 * 60 * 1000;

    @Override
    public int getDurationInDays() {
        return (int) ((toDate.getTime() - fromDate.getTime()) / msInOneDay);
    }

    @Override
    public void printSchedule() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
