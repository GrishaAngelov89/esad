package esad.chapter2.task3;

/**
 * @author: grisha_angelov
 */
public class Account {

    boolean isComplexPassword(String password) {

        return containsDigit(password) && containsLetter(password) && containsSymbol(password);
    }

    private boolean containsLetter(String password) {
        boolean isLetter = false;
        // algorithm
        return isLetter;
    }

    public boolean containsSymbol(String password) {
        boolean isSymbol = false;
        // algorithm
        return isSymbol;
    }

    public boolean containsDigit(String password){
        boolean isDigit = false;
        // algorithm
        return isDigit;
    }
}
