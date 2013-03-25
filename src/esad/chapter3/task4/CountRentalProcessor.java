package esad.chapter3.task4;

/**
 * @author: grisha_angelov
 */
public class CountRentalProcessor implements Processor {
    private int count = 0;

    @Override
    public void process(BookRental bookRental) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
