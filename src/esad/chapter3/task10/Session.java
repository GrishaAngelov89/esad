package esad.chapter3.task10;

import java.util.Date;

/**
 * @author grisha_angelov
 */
public class Session {
    Date date;
    int startHour;
    int endHour;

    int getDuration() {
        return endHour - startHour;
    }
}
