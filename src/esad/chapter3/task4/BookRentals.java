package esad.chapter3.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: grisha_angelov
 */

public class BookRentals {
    List<BookRental> rentals = new ArrayList<BookRental>();
    // fill the list

    int countRentals() {
        return rentals.size();
    }

    BookRental getRentalAt(int i) {
        return rentals.get(i);
    }

    void printOverdueRentals() {
        processTheRental(new PrintRentalProcessor());
    }

    int countOverdueRentals() {
        CountRentalProcessor countRentalProcessor = new CountRentalProcessor();
        processTheRental(countRentalProcessor);
        return countRentalProcessor.getCount();
    }

    private void processTheRental(Processor processor) {
        for (int i = 0; i < countRentals(); i++) {
            BookRental rental = getRentalAt(i);
            if (rental.isOverdue()) {
                processor.process(rental);
            }
        }
    }
}
