package esad.chapter3.example.useraccount;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author: grisha_angelov
 */
public class InventoryApp {
    void login(Account userLoggingIn, String password) {
        if (userLoggingIn.checkPassword(password)) {
            GregorianCalendar today = new GregorianCalendar();
            GregorianCalendar expiryDate = getAccountExpiryDate(userLoggingIn);
            if (today.after(expiryDate)) {
                // logic
            }
        }
    }

    GregorianCalendar getAccountExpiryDate(Account account) {
        int passwordMaxAgeInDays = getPasswordMaxAgeInDays(account);
        GregorianCalendar expiryDate = new GregorianCalendar();
        expiryDate.setTime(account.getDateOfLastPasswordChange());
        expiryDate.add(Calendar.DAY_OF_MONTH, passwordMaxAgeInDays);
        return expiryDate;
    }

    int getPasswordMaxAgeInDays(Account account) {
        return account.getPasswordMaxAgeInDays();
    }

    void printReport(Account currentUser) {
        boolean canPrint = currentUser.canPrint();
        if (!canPrint) {
            throw new SecurityException("You have no right");
        }
    }
}
