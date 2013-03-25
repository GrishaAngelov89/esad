package esad.chapter3.task11;

import java.util.Date;

/**
 * @author grisha_angelov
 */
public class BookRental implements Rental {
    String bookTitle;
    String author;
    Date rentDate;
    Date dueDate;
    double rentalFee;

    public boolean isOverdue() {
        Date now = new Date();
        return dueDate.before(now);
    }

    public double getTotalFee() {
        return isOverdue() ? 1.2 * rentalFee : rentalFee;
    }
}
