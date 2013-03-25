package esad.chapter3.task11;

import java.util.Date;

/**
 * @author grisha_angelov
 */
public class MovieRental implements Rental{
    String movieTitle;
    int classification;
    Date rentDate;
    Date dueDate;
    double rentalFee;

    public boolean isOverdue() {
        Date now = new Date();
        return dueDate.before(now);
    }

    public double getTotalFee() {
        return isOverdue() ? Math.max(1.3 * rentalFee, rentalFee + 20) : rentalFee;
    }
}
