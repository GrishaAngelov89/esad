package esad.chapter3.example.useraccount;

import java.util.Date;

/**
 * @author: grisha_angelov
 */

abstract class Account {
    String id;
    String name;
    String password;
    Date dateOfLastPasswordChange;

    abstract public boolean checkPassword(String password);

    abstract public Date getDateOfLastPasswordChange();

    abstract public int getPasswordMaxAgeInDays();

    abstract public boolean canPrint();
}

class NormalAccount extends Account {

    @Override
    public boolean checkPassword(String password) {
        return false;
    }

    @Override
    public Date getDateOfLastPasswordChange() {
        return dateOfLastPasswordChange;
    }

    @Override
    public int getPasswordMaxAgeInDays() {
        return 90;
    }

    @Override
    public boolean canPrint() {
        return true;
    }
}

class AdminAccount extends Account {

    @Override
    public boolean checkPassword(String password) {
        return false;
    }

    @Override
    public Date getDateOfLastPasswordChange() {
        return dateOfLastPasswordChange;
    }

    @Override
    public int getPasswordMaxAgeInDays() {
        return 30;
    }

    @Override
    public boolean canPrint() {
        return true;
    }
}

class GuestAccount extends Account {

    @Override
    public boolean checkPassword(String password) {
        return false;
    }

    @Override
    public Date getDateOfLastPasswordChange() {
        return dateOfLastPasswordChange;
    }

    @Override
    public int getPasswordMaxAgeInDays() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean canPrint() {
        return false;
    }
}
