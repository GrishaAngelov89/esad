package esad.chapter1.task6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 * @author: grisha_angelov
 */
class Restaurant extends Account {
    //the string "Rest" is concated with the restaurant ID to
    //form the key.
    final static String RestaurantIDText = "Rest";
    String website;
    //address in Chinese.
    String addr_cn;
    //address in English.
    String addr_en;
    //the restaurant would like to update its fax # with this. After it is
    //confirmed, it will be stored in AccountClass. Before that, it is stored
    //here.
    String numb_newfax;
    boolean has_NewFax = false;
    //a list of holidays.
    Vector Holiday; // a holiday
    //id of the category this restaurant belongs to.
    String catId;
    //a list of business session. Each business session is an array
    //of two times. The first time is the start time. The second time
    //is the end time. The restaurant is open for business in each
    //session.
    Vector BsHour; //Business hour

    //y: year.
    //m: month.
    //d: date.
    void addHoliday(int y, int m, int d) {
        if (y < 1900) y += 1900;
        Calendar aHoliday = (new GregorianCalendar(y, m, d, 0, 0, 0));
        Holiday.add(aHoliday);
    }

    public boolean addBsHour(int fromHr, int fromMin, int toHr, int toMin) {
        int fMin = getMinutesFromMidNight(fromHr, fromMin);
        int tMin = getMinutesFromMidNight(toHr, toMin);
        if (isMinutesWithinOneDay(fMin) &&
                isMinutesWithinOneDay(tMin) &&
                fMin < tMin){
            GregorianCalendar bs[] = {
                    convertTimeToDate(fromHr, fromMin),
                    convertTimeToDate(toHr, toMin)
            };
            BsHour.add(bs);
            return true;
        } else {
            return false;
        }
    }

    int getMinutesFromMidNight(int hours, int minutes) {
        return hours*60+minutes;
    }
    boolean isMinutesWithinOneDay(int minutes) {
        return minutes>0 && minutes<=1440;
    }
    GregorianCalendar convertTimeToDate(int hours, int minutes) {
        return new GregorianCalendar(1900, 1, 1, hours, minutes, 0);
    }
}