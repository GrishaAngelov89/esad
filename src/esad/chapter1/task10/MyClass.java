package esad.chapter1.task10;

import java.util.Date;

/**
 * @author: grisha_angelov
 */
public class MyClass {

    public class BookRental extends Rental {
        private String bookTitle;
        private String author;
        private double rentalFee;

        @Override
        protected double getCoefficient() {
            return 1.2;
        }
    }

    public class MovieRental extends Rental {
        private String movieTitle;
        private int classification;
        private Date rentDate;


        @Override
        protected double getCoefficient() {
            return 1.3;
        }
    }

    abstract class Rental {
        private Date dueDate;
        private double rentalFee;

        public boolean isOverdue() {
            Date now = new Date();
            return dueDate.before(now);
        }

        public double getTotalFree() {
            return isOverdue() ? getCoefficient() * rentalFee : rentalFee;
        }

        protected abstract double getCoefficient();
    }

}
