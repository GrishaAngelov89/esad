package esad.chapter3.task5;

/**
 * @author: grisha_angelov
 */

class Usd implements Money {

    @Override
    public String format(int amount) {
        return "$" + amount;
    }
}

class Euro implements Money {

    @Override
    public String format(int amount) {
        return "EUR " + amount;
    }
}

class Lev implements Money {

    @Override
    public String format(int amount) {
        return amount + " LV";
    }
}

public class Currency {
    private Money money;

    public Currency(Money money) {
        this.money = money;
    }

    public String formatCurrency(int amount) {
        return money.format(amount);
    }
}
