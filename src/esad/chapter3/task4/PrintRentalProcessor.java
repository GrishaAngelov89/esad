package esad.chapter3.task4;

/**
 * @author: grisha_angelov
 */
public class PrintRentalProcessor implements Processor{
    
    @Override
    public void process(BookRental bookRental) {
        System.out.println(bookRental);
    }
}
